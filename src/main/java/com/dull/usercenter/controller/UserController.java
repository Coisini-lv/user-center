package com.dull.usercenter.controller;

import com.dull.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author LvShuaihang
 * @date 2024-06-23 22:36
 * @Requirements:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public long register(String userAccount, String userPassword) {
        userService.userRegister(userAccount, userPassword);
        return 1;
    }
}
