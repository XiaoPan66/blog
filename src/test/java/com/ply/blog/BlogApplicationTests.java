package com.ply.blog;

import com.ply.blog.entity.pojo.TbUserEntity;
import com.ply.blog.mapper.UserMapper;
import com.ply.blog.service.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.yaml"})
@SpringBootTest
class BlogApplicationTests {
    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;


    @Test
    void contextLoads() {
        Optional<TbUserEntity> userInfo = userMapper.findById(1);
        System.out.println(userInfo);
    }
}
