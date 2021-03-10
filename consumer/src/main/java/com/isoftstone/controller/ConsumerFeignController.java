package com.isoftstone.controller;

import com.isoftstone.client.UserClient;
import com.isoftstone.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:55
 */
@Slf4j
@RestController
@RequestMapping("/cf")
public class ConsumerFeignController {
    @Resource
    private UserClient userClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        return userClient.queryById(id);
    }
}
