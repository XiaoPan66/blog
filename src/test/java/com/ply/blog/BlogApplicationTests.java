package com.ply.blog;

import com.ply.blog.entity.pojo.User;
import com.ply.blog.mapper.UserMapper;
import com.ply.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User byId = userService.getById(1);
        System.out.println(byId);
        User userId = userMapper.findUserId(1);
        System.out.println(userId);
    }
}
