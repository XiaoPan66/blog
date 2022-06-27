package com.ply.blog.exception;

import org.springframework.data.redis.connection.ReactiveSetCommands;

/**
 * @description: 服务接口类
 * @author: DT
 * @date: 2021/4/19 21:39
 */
public interface BaseErrorInfoInterface {
    /**
     *  错误码
     * @return
     */
    Integer getCode();

    /**
     * 错误描述
     * @return
     */
    String getExplain();
}
