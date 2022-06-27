package com.ply.blog.config;

import com.ply.blog.entity.result.R;
import com.ply.blog.entity.result.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public R<?> exceptionLogin(RuntimeException e,ResultCode resultCode) {
        e.printStackTrace();
        return R.error(resultCode.getCode());
    }
}