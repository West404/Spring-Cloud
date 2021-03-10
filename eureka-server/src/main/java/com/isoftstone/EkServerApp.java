package com.isoftstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 17:14
 */
@SpringBootApplication
@EnableEurekaServer
public class EkServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EkServerApp.class, args);
    }
}
