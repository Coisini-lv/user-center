package com.dull.usercenter.service;

import com.dull.usercenter.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lvshuaihang
* @description 针对表【user】的数据库操作Service
* @createDate 2024-06-23 17:11:53
*/
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword);
}
