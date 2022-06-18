package com.ply.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class TbContext implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    @TableId(value = "context_id", type = IdType.AUTO)
    private Integer contextId;

    /**
     * 文章name
     */
    private String contextName;

    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 文章内容
     */
    private String context;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 浏览量
     */
    private Integer numberOfViews;

    /**
     * 是否被删除 1被删除 0没有删除 默认0
     */
    private Integer isDel;


}
