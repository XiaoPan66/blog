package com.ply.blog.entity.result;

/**
 * @author XiaoPan
 * date: 2022/6/18 23:21
 * <p>
 * action:
 */
public enum ResultCode {
//   操作
    CODE_OPERATE_OK("操作成功", 400),
    CODE_OPERATE_ERROR("操作成功", 401);





    ResultCode(String explain, Integer code) {
        this.explain = explain;
        this.code = code;
    }
//    解释说明
    String explain;
//    状态码
    Integer code;
}
