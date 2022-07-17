package com.ply.blog.service.base;

import com.ply.blog.constant.ParameterException;
import com.ply.blog.exception.NotFoundException;
import com.ply.blog.repository.base.BaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author LongYU
 * @Date 2022/7/17 15:14
 */
@Slf4j
public abstract class BaseServiceImpl<DOMAIN, ID> implements BaseService<DOMAIN, ID> {
    private final String domainName;

    private final BaseRepository<DOMAIN, ID> repository;

    public BaseServiceImpl(BaseRepository<DOMAIN, ID> repository) {
        this.repository = repository;

        @SuppressWarnings("unchecked")
        String simpleName = ((Class<DOMAIN>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        domainName = simpleName;
    }


    @Override
    public List<DOMAIN> listAll() {
        return repository.findAll();
    }

    @Override
    public List<DOMAIN> listAll(Sort sort) {
        Assert.notNull(sort, ParameterException.SortNUllMsg);
        return repository.findAll(sort);
    }

    @Override
    public Page<DOMAIN> listAll(Pageable pageable) {
        Assert.notNull(pageable, ParameterException.PageableNUllMsg);
        return repository.findAll(pageable);
    }

    @Override
    public List<DOMAIN> listAllByIds(Collection<ID> ids) {
        return CollectionUtils.isEmpty(ids) ? Collections.emptyList() : repository.findAllById(ids);
    }


    @Override
    public List<DOMAIN> listAllByIds(Collection<ID> ids, Sort sort) {
        Assert.notNull(sort, ParameterException.SortNUllMsg);
        return CollectionUtils.isEmpty(ids) ? Collections.emptyList() : repository.findAllByIdIn(ids, sort);
    }

    @Override
    public Optional<DOMAIN> fetchById(ID id) {
        Assert.notNull(id, domainName + ParameterException.IdNullMsg);
        return repository.findById(id);
    }

    @Override
    public DOMAIN getById(ID id) {
        return fetchById(id).orElseThrow(
                () -> new NotFoundException(domainName + " was not found or has been deleted")
        );
    }

    @Override
    public DOMAIN getByIdOfNullable(ID id) {
        return fetchById(id).orElse(null);
    }

    @Override
    public boolean existsById(ID id) {
        Assert.notNull(id, domainName + ParameterException.IdNullMsg);
        return repository.existsById(id);
    }

    @Override
    public void mustExistById(ID id) {
        if (!existsById(id)) {
            throw new NotFoundException(domainName + " was not exist");
        }
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public DOMAIN create(DOMAIN domain) {
        Assert.notNull(domain, domainName + " data must not be null");
        return repository.save(domain);
    }

    @Override
    public List<DOMAIN> createInBatch(Collection<DOMAIN> domains) {
        return CollectionUtils.isEmpty(domains) ? Collections.emptyList() :
                repository.saveAll(domains);
    }

    @Override
    public DOMAIN update(DOMAIN domain) {
        Assert.notNull(domain, domainName + " data must not be null");
        return repository.saveAndFlush(domain);
    }

    @Override
    public void flush() {
        repository.flush();
    }

    @Override
    public List<DOMAIN> updateInBatch(Collection<DOMAIN> domains) {
        return CollectionUtils.isEmpty(domains) ? Collections.emptyList() :
                repository.saveAll(domains);
    }

    @Override
    public DOMAIN removeById(ID id) {
        DOMAIN domain = getById(id);

        // Remove it
        remove(domain);

        // return the deleted domain
        return domain;
    }

    @Override
    public DOMAIN removeByIdOfNullable(ID id) {
        return fetchById(id).map(domain -> {
            remove(domain);

            return domain;
        }).orElse(null);
    }

    @Override
    public void remove(DOMAIN domain) {
        Assert.notNull(domain, domainName + " data must not be null");
        // todo 删除的 逻辑 使用 逻辑删除
        repository.delete(domain);
    }

    @Override
    public void removeInBatch(Collection<ID> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            log.debug(domainName + " id collection is empty");
            return;
        }

        repository.deleteByIdIn(ids);
    }

    @Override
    public void removeAll(Collection<DOMAIN> domains) {
        if (CollectionUtils.isEmpty(domains)) {
            log.debug(domainName + " collection is empty");
            return;
        }
        repository.deleteAllInBatch(domains);
    }

    @Override
    public void removeAll() {
        repository.deleteAll();
    }
}
