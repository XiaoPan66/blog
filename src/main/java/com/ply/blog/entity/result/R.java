package com.ply.blog.entity.result;

import lombok.AllArgsConstructor;

/**
 * @author XiaoPan
 * date: 2022/3/18 19:37
 * <p>
 * action:  统一返回结果的类
 */
@AllArgsConstructor
public class R<T> {
    //    是否成功
    private Boolean success;

    //    状态码
    private Integer code;

    //    返回message
    private String message;

    //    返回数据
    private T data;

    private R() {
    }

    //    设置成功
    private R<?> sSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    private R<?> sCode(Integer code) {
        this.code = code;
        return this;
    }

    private R<?> sMessage(String message) {
        this.message = message;
        return this;
    }

    private R<T> sData(T data) {
        this.data = data;
        return this;
    }

    public static R<?> ok() {
        return new R<>().sSuccess(true).sCode(ResultCode.CODE_OPERATE_OK.code);
    }

    public static R<?> error() {
        return new R<>().sSuccess(false).sCode(ResultCode.CODE_OPERATE_ERROR.code);
    }
}
