package com.ply.blog.service.impl;

import com.ply.blog.entity.pojo.Context;
import com.ply.blog.mapper.ContextMapper;
import com.ply.blog.service.ContextService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Service
public class ContextServiceImpl extends ServiceImpl<ContextMapper, Context> implements ContextService {

    @Override
    public int addContext(String contextName, Integer tagId, String context) {
        return 0;
    }

    @Override
    public int updateContext(String contextName, Integer tagId, String context) {
        return 0;
    }

    @Override
    public int delContext(Integer contextId) {
        return 0;
    }

    @Override
    public List<Context> queryContext() {
        return null;
    }
}
