package com.weijie.controller;

import com.weijie.pojo.User;
import com.weijie.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("test")
    public String hello(){
        List<User> users = userService.getUserList();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("zs",users);
        return "test";
    }
}
