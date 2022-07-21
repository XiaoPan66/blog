package com.ply.blog.exception;

import org.springframework.http.HttpStatus;

/**
 * @author LongYU
 * @Date 2022/7/21 21:45
 */
public class BeanUtilsException extends AbstractException{
    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
