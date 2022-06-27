package com.ply.blog.dao;

import com.ply.blog.entity.pojo.TbCommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
public interface CommentsMapper extends JpaRepository<TbCommentsEntity, Integer> {

}
