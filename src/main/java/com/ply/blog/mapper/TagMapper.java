package com.ply.blog.mapper;

import com.ply.blog.entity.pojo.TbTagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Repository
public interface TagMapper extends JpaRepository<TbTagEntity, Integer> {

}
