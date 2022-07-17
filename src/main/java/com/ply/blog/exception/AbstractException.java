package com.ply.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.management.ObjectName;

/**
 * @author LongYU
 * @Date 2022/7/17 17:03
 */
public abstract class AbstractException extends RuntimeException {

    private Object errorDate;

    public AbstractException(String message) {
        super(message);
    }

    public AbstractException(String message, Throwable cause) {
        super(message, cause);
    }

    @NonNull
    public abstract HttpStatus getStatus();

    @Nullable
    public Object getErrorDate(){
        return errorDate;
    }

    @NonNull
    public AbstractException setErrorData(@Nullable Object errorData){
        this.errorDate = errorData;
        return this;

    }
}
