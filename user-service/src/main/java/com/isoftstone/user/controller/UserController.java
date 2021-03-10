package com.isoftstone.user.controller;

import com.isoftstone.user.domain.User;
import com.isoftstone.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("Provider try to offer necessary service ...");
        /*if (id==1){
            throw new RuntimeException("主动制造错误");
        }*/
        return userService.findById(id);
    }
}
