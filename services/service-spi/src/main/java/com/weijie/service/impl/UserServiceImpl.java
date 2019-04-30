package com.weijie.service.impl;

import com.weijie.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {


    public String getUserList() {
        String str="heelo word 1111";
        return str;
    }
}
