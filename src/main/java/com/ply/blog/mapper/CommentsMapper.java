package com.ply.blog.mapper;

import com.ply.blog.entity.pojo.Comments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface CommentsMapper extends BaseMapper<Comments> {

}
