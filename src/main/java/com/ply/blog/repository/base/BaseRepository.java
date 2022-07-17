package com.ply.blog.repository.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.List;

/**
 * @author LongYU
 * @Date 2022/7/12 21:21
 */
//不需要 bean 注入
@NoRepositoryBean
public interface BaseRepository<D,I> extends JpaRepository<D,I> {

    /**
     * Finds all domain by id list.
     * 查询所有通过主键查询
     */
    @NonNull
    List<D> findAllByIdIn(@NonNull Collection<I> ids, @NonNull Sort sort);


    /**
     * Finds all domain by domain id list.
     * 分页查询 查询所有通过主键查询
     */

    @NonNull
    Page<D> findAllByIdIn(@NonNull Collection<I> ids, @NonNull Pageable pageable);

    /**
     *  Deletes by id list.
     *  删除 通过 主键
     *
     */

    long deleteByIdIn(@NonNull Collection<I> ids);



}
