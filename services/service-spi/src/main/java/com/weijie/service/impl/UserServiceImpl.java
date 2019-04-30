package com.weijie.service.impl;

import com.weijie.dao.UserMapper;
import com.weijie.pojo.User;
import com.weijie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList() {
        List<User> key = userMapper.getKey();
        return key;
    }
}
