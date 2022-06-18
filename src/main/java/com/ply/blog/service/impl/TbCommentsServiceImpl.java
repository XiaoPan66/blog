package com.ply.blog.service.impl;

import com.ply.blog.entity.TbComments;
import com.ply.blog.mapper.TbCommentsMapper;
import com.ply.blog.service.TbCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Service
public class TbCommentsServiceImpl extends ServiceImpl<TbCommentsMapper, TbComments> implements TbCommentsService {

}
