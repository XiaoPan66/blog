package com.ply.blog;

import com.ply.blog.entity.TbUser;
import com.ply.blog.mapper.TbUserMapper;
import com.ply.blog.service.TbUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    TbUserService tbUserService;

    @Autowired
    TbUserMapper tbUserMapper;

    @Test
    void contextLoads() {
        TbUser byId = tbUserService.getById(1);
        System.out.println(byId);
        TbUser userId = tbUserMapper.findUserId(1);
        System.out.println(userId);
    }
}
