package com.ply.blog.entity.result;

import com.ply.blog.exception.BaseErrorInfoInterface;

/**
 * @author XiaoPan
 * date: 2022/6/18 23:21
 * <p>
 * action:
 */
public enum ResultCode implements BaseErrorInfoInterface {
//   操作
    OK("操作成功", 400),

    CODE_OPERATE_ERROR("操作失败", 401),

    CODE_LOGIN_ERROR("用户名或密码错误",9001);

    ResultCode(String explain, Integer code) {
        this.explain = explain;
        this.code = code;
    }
//    解释说明
    private final String explain;
//    状态码
    private final Integer code;

    public Integer getCode(){
        return code;
    }

    @Override
    public String getExplain(){
        return explain;
    }
}
