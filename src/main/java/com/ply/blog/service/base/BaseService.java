package com.ply.blog.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * 创建通用方法接口
 *
 * @author LongYU
 * @Date 2022/7/17 15:01
 */
public interface BaseService<D, I> {

    @NonNull
    List<D> listAll();


    @NonNull
    List<D> listAll(@NonNull Sort sort);

    @NonNull
    Page<D> listAll(@NonNull Pageable pageable);

    @NonNull
    List<D> listAllByIds(@Nullable Collection<I> ids);

    List<D> listAllByIds(@Nullable Collection<I> ids, @NonNull Sort sort);

    /**
     * 通过id 查询
     */
    Optional<D> fetchById(@NonNull I id);


    @NonNull
    D getById(@NonNull I id);

    /**
     * 返回 可以 为空
     */
    @Nullable
    D getByIdOfNullable(@NonNull I id);



    boolean existsById(@NonNull I id);


    void mustExistById(@NonNull I id);

    /**
     * 返回 条数
     */
    long count();


    /**
     * 增加
     */
    @NonNull
    @Transactional
    D create(@NonNull D domain);


    @NonNull
    @Transactional
    List<D> createInBatch(Collection<D> domains);


    @NonNull
    @Transactional
    D update(@NonNull D domain);

    /**
     * 刷新 所有的 改变 到数据库
     */
    void flush();


    @NonNull
    @Transactional
    List<D> updateInBatch(@NonNull Collection<D> domains);

    @NonNull
    @Transactional
    D removeById(@NonNull I id);



    @Nullable
    @Transactional
    D removeByIdOfNullable(@NonNull I id);


    @Transactional
    void remove(@NonNull D domain);


    @Transactional
    void removeInBatch(@NonNull Collection<I> ids);



    @Transactional
    void removeAll(@NonNull Collection<D> domains);


    @Transactional
    void removeAll();
}
