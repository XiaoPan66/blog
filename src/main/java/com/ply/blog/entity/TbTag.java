package com.ply.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class TbTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    /**
     * 标签name
     */
    private String tagName;

    /**
     * 是否被删除 1被删除 0没有删除 默认0
     */
    private Integer isDel;


}
