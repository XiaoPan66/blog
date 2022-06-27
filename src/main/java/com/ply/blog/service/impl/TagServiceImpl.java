package com.ply.blog.service.impl;

import com.ply.blog.dao.TagMapper;
import com.ply.blog.entity.pojo.TbTagEntity;
import com.ply.blog.service.TagService;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

public class TagServiceImpl implements TagService {
    @Resource
    TagMapper tagMapper;

    //    增删改查
    //    增加tag
    public TbTagEntity addTag(String tagName) {

        if (!StringUtils.hasText(tagName)) {
            throw new RuntimeException();
        }
        TbTagEntity tbTagEntity = new TbTagEntity();
        tbTagEntity.setTagName("java");
        TbTagEntity save = tagMapper.save(tbTagEntity);
        return save;
    }
}

