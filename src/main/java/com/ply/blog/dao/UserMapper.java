package com.ply.blog.dao;

import com.ply.blog.entity.pojo.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * <p>
 * 服务类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
public interface UserMapper extends JpaRepository<TbUserEntity, Integer> {
//    通过 name 获取 user
    TbUserEntity findByUserName();

}