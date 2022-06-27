package com.ply.blog.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author XiaoPan
 * date: 2022/6/27 22:20
 * <p>
 * action:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseException extends RuntimeException{
    /**
     * 错误码
     */
    protected Integer errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public BaseException(BaseErrorInfoInterface s) {
        super(s.getCode().toString());
        this.errorCode = s.getCode();
        this.errorMsg = s.getExplain();
    }
}
