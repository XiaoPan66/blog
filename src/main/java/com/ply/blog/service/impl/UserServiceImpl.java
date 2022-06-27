package com.ply.blog.service.impl;

import com.ply.blog.dao.UserMapper;
import com.ply.blog.entity.pojo.TbUserEntity;
import com.ply.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public void login(String name, String pwd) {
        TbUserEntity user = userMapper.findByUserName();
        if (user == null || user.getPwd().equals(pwd)) {
//            throw new RuntimeException(e,ResultCode.CODE_LOGIN_ERROR);
        }
    }

    @Override
    public void loginOut() {
//        获取 id

    }

    @Override
    public TbUserEntity getUserInfo() {
        return null;
    }
}