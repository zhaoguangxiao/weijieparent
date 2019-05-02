package com.weijie.service;

import com.weijie.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTestCase {


    @Autowired
    private UserService userService;


    @Test
    public void assertNotNull(){
        Assert.assertNotNull(userService);
    }


    @Test
    public void getUserListTest(){
        List<User> userList = userService.getUserList();
        Assert.assertNotNull(!userList.isEmpty());
    }

}
