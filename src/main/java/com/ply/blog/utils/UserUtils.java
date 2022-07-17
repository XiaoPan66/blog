package com.ply.blog.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

/**
 * @author XiaoPan
 * date: 2022/1/15 14:18
 * <p>
 * action:
 * <p>
 * 两种方法 一样的 获取 getRequest 的本质也是 ThreadLocal 里面的 存储的   并且在最后   会被 spring 自动清除
 * <p>
 * 都一样 在 都是 在request 中  存储 和 取出
 */
public class UserUtils {
    private static final String USERNAME = "userName";
    private static final String USERID = "userId";
//    用户类型

    public static String getUserName() {
//        ThreadLocal<Integer> userIdL = new ThreadLocal<>();
//       return userIdL.get();
        return (String) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getAttribute(USERNAME);
    }

    public static void setUserName(String userName) {
//        ThreadLocal<Integer> userIdL = new ThreadLocal<>();
//        userIdL.set(userId);
        ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().setAttribute(USERNAME, userName);
    }


    public static Integer getUserId() {
//        ThreadLocal<Integer> userIdL = new ThreadLocal<>();
//       return userIdL.get();
        return (Integer) ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getAttribute(USERID);
    }

    public static void setUserId(Integer userId) {
//        ThreadLocal<Integer> userIdL = new ThreadLocal<>();
//        userIdL.set(userId);
        ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().setAttribute(USERID, userId);
    }

    public static void addUserUtils(Integer id, String name){
        UserUtils.setUserId(id);
        UserUtils.setUserName(name);
    }

    static void clear() {}

}
