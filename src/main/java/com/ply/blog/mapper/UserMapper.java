package com.ply.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ply.blog.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User findUserId(Integer id);
}
