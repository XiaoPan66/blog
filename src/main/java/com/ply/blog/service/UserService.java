package com.ply.blog.service;

import com.ply.blog.entity.pojo.TbUserEntity;

public interface UserService {
    /**
     * 用户登录
     */
    void login(String name, String pwd);


    /**
     * 用户 注销
     */
    void loginOut();

    /**
     * 获取用户信息
     */
    TbUserEntity getUserInfo();

}
