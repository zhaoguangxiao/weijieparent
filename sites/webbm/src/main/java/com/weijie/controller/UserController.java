package com.weijie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("test")
    public String hello(){
        return "test";
    }
}
