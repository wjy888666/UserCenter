package com.wjy.usercenter.service;

import com.wjy.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author:wjy
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("Mousewjy");
        user.setUserAccount("123");
        user.setAvatarUrl("https://img0.baidu.com/it/u=370726528,4162472930&fm=253&fmt=auto&app=138&f=JPG?w=500&h=500");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }


        @Test
        void userRegister() {

        }
    }
