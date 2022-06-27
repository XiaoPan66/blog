package com.ply.blog;

import com.ply.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    UserService userService;

    @Autowired

    @Test
    void contextLoads() {

    }
}
