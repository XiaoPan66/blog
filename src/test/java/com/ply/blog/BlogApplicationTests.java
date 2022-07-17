package com.ply.blog;

import com.ply.blog.entity.pojo.TbContextEntity;
import com.ply.blog.entity.pojo.TbUserEntity;
import com.ply.blog.entity.wrapper.ContextWrapper;
import com.ply.blog.mapper.UserMapper;
import com.ply.blog.service.ContextService;
import com.ply.blog.service.UserService;
import com.ply.blog.utils.UserUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


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
        userService.login("ply","12345");
    }
    @Test
    void getUserInfo(){
        UserUtils.setUserId(1);
        TbUserEntity userInfo = userService.getUserInfo(UserUtils.getUserId());
        System.out.println(userInfo);
    }
}
