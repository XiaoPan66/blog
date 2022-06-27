package com.ply.blog.exception.ex;

import com.ply.blog.exception.BaseErrorInfoInterface;
import com.ply.blog.exception.BaseException;

/**
 * @author XiaoPan
 * date: 2022/6/27 12:09
 * <p>
 * action: 用户操作异常
 */
public class UserException extends BaseException {
    public UserException(BaseErrorInfoInterface s) {
        super(s);
    }
}
