package com.ply.blog.exception;

import com.ply.blog.entity.result.Result;
import com.ply.blog.entity.result.ResultCode;
import com.ply.blog.exception.ex.UserException;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<?> error(Exception e){
        log.debug(e.getMessage());
        return Result.error().setMessage(e.getMessage());
    }


    @ExceptionHandler(UserException.class)
    @ResponseBody
    public Result<?> error(UserException e){
        log.debug(e.getMessage());
        return Result.error().setMessage(e.getMessage());
    }


}