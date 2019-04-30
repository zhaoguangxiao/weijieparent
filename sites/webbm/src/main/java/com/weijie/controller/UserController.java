package com.weijie.controller;

import com.weijie.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("test")
    public String hello(){
        String userList = userService.getUserList();
        return userList;
    }
}
