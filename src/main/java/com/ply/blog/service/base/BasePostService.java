package com.ply.blog.service.base;

import com.ply.blog.model.entity.BasePost;
import com.ply.blog.model.enums.PostStatus;

/**
 * @author LongYU
 * @Date 2022/7/17 17:22
 */
public interface BasePostService<POST extends BasePost> extends BaseService<POST, Integer> {

    /**
     * count visit total number
     */
    long countVisit();

    /**
     * count like total number
     */
    long countLike();

    /**
     * Count posts by status.
     */
    long countByStatus(PostStatus status);




}
