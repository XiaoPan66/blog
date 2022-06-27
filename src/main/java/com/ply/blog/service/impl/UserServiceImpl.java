package com.ply.blog.service.impl;

import com.ply.blog.entity.result.ResultCode;
import com.ply.blog.exception.ex.UserException;
import com.ply.blog.mapper.UserMapper;
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
        TbUserEntity user = userMapper.getByUserName(name);
        if (user == null || user.getPwd().equals(pwd)) {
            throw new UserException(ResultCode.CODE_LOGIN_ERROR);
        }
    }

    @Override
    public void loginOut() {
//        获取 id
    }

    @Override
    public TbUserEntity getUserInfo() {
        return userMapper.getByUserName("ply");
    }
}