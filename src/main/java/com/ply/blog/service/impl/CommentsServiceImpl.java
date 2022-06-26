package com.ply.blog.service.impl;

import com.ply.blog.entity.pojo.Comments;
import com.ply.blog.mapper.CommentsMapper;
import com.ply.blog.service.CommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {

}
