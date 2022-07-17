package com.ply.blog.annotation;

import java.lang.annotation.*;

/**
 * @author LongYU
 * @Date 2022/7/12 21:35
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SensitiveConceal {
    /*
     * 隐藏 敏感信息 过滤 注解
     */
}
