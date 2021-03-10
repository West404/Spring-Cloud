package com.isoftstone.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:01
 */
@SpringBootApplication
@MapperScan("com.isoftstone.user.mapper")
@EnableEurekaClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
