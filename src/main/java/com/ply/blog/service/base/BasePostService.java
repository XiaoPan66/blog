package com.ply.blog.service.base;

import com.ply.blog.model.entity.BasePost;
import com.ply.blog.model.enums.PostStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

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

    /**
     * 通过 slug 爬虫 网址 唯一的
     */
    @NonNull
    POST getBySlug(@NonNull String slug);

    @NonNull
    POST getBy(@NonNull PostStatus status, @NonNull String slug);

    @NonNull
    POST getBy(@NonNull PostStatus status, @NonNull Integer id);


    @NonNull
    List<POST> listAllBy(@NonNull PostStatus status);

    /**
     * Lists previous posts.
     *
     * @param post post must not be null
     * @param size previous max post size
     * @return a list of previous post
     */
    @NonNull
    List<POST> listPrevPosts(@NonNull POST post, int size);

    @NonNull
    List<POST> listNextPosts(@NonNull POST post, int size);

    @NonNull
    Optional<POST> getPrevPost(@NonNull POST post);

    @NonNull
    Optional<POST> getNextPost(@NonNull POST post);


    @NonNull
    Page<POST> pageLatest(int top);

    @NonNull
    List<POST> listLatest(int top);

    @NonNull
    Page<POST> pageBy(@NonNull Pageable pageable);

    Page<POST> pageBy(@NonNull PostStatus status, @NonNull Pageable pageable);

    void increaseVisit(long visits, @NonNull Integer postId);

    void increaseVisit(@NonNull Integer postId);

    void increaseLike(long likes, @NonNull Integer postId);

    void increaseLike(@NonNull Integer postId);


    @NonNull
    POST createOrUpdateBy(@NonNull POST post);

    @NonNull
    POST filterIfEncrypt(@NonNull POST post);





}
