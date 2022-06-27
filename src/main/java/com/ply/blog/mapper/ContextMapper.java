package com.ply.blog.mapper;

import com.ply.blog.entity.pojo.TbContextEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Repository
public interface ContextMapper extends JpaRepository<TbContextEntity, Integer> {
    /**
     * 发表文章  在前面判断 tagID 是否 合法
     */
    int addContext(String contextName,Integer tagId,String context);


    /**
     * 修改文章 内容 和 标题 或者 修改 标签
     */
    int updateContext(String contextName,Integer tagId,String context);

    /**
     * 删除文章
     */
    int delContext(Integer contextId);

    /**
     * 查询 文章 分页 条件查询 时间倒数  只通过 分类id 进行查询
     */
    List<TbContextEntity> queryContext();


}
