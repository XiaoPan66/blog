package com.ply.blog.exception;

import org.springframework.http.HttpStatus;

/**
 * @author LongYU
 * @Date 2022/7/17 16:55
 */
public class NotFoundException extends AbstractException{

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
