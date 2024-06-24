package com.dull.usercenter.service;

import com.dull.usercenter.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * Description:
 * 用户服务测试
 * @author LvShuaihang
 * @date 2024-06-23 17:22
 * @Requirements:
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("testLsh");
        user.setUserAccount("123");
        user.setAvatarUrl("http://www.baidu.com");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("111");
        user.setEmail("123456@gmail.com");


        boolean result = userService.save(user);
        System.out.println(user.getUid());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "lsh";
        String userPassword = "123456";
        long result = userService.userRegister(userAccount, userPassword);
        Assertions.assertEquals(-1, result);
    }
}