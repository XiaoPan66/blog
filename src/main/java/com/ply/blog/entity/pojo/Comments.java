package com.ply.blog.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author XiaoPan
 * @since 2022-06-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_comments")
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 上层id
     */
    private Integer upCommentId;

    /**
     * 文章id
     */
    private Integer contextId;

    /**
     * 文章内容
     */
    private String comments;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态 审核 通过没有通过
     */
    private Integer status;

    /**
     * 是否被删除 1被删除 0没有删除 默认0
     */
    private Integer isDel;


}
