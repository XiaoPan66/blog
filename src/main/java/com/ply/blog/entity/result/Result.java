package com.ply.blog.entity.result;

import lombok.AllArgsConstructor;

/**
 * @author XiaoPan
 * date: 2022/3/18 19:37
 * <p>
 * action:  统一返回结果的类
 */
@AllArgsConstructor
public class Result<T> {
    //    是否成功
    private Boolean success;

    //    状态码
    private Integer code;

    //    返回message
    private String message;

    //    返回数据
    private T data;

    private Result() {
    }

    //    设置成功
    public Result<?> setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Result<?> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Result<?> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static Result<?> ok() {
        return new Result<>().setSuccess(true).setCode(ResultCode.OK.getCode());
    }

    public static Result<?> error() {
        return new Result<>().setSuccess(false).setCode(ResultCode.CODE_OPERATE_ERROR.getCode());
    }

    public static Result<?> error(ResultCode resultCode) {
        return new Result<>().setSuccess(false).setCode(resultCode.getCode());
    }

}
