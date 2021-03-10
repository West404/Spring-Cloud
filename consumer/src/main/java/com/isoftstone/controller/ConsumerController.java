package com.isoftstone.controller;

import com.alibaba.fastjson.JSON;
import com.isoftstone.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:55
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    //@HystrixCommand(fallbackMethod = "queryByIdFallback")
    @HystrixCommand
    public String queryById(@PathVariable Long id) {
        //List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //ServiceInstance serviceInstance = instances.get(0);
        //String host = serviceInstance.getHost();
        //int port = serviceInstance.getPort();
        //String url = "http://" + host + ":" + port + "/user/" + id;
        String url = "http://user-service/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return JSON.toJSONString(user);
    }

    public String queryByIdFallback(Long id) {
        log.error("查询用户信息失败。id:{}", id);
        return "对不起，网络太拥挤了！";
    }

    public String defaultFallback() {
        return "默认提示:对不起，网络太拥挤了！";
    }
}
