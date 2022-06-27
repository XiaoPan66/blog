package com.ply.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_context", schema = "blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbContextEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "context_id")
    private Integer contextId;
    @Basic
    @Column(name = "context_name")
    private String contextName;
    @Basic
    @Column(name = "image")
    private String image;
    @Basic
    @Column(name = "tag_id")
    private Integer tagId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "context")
    private String context;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @Basic
    @Column(name = "update_time")
    private Date updateTime;
    @Basic
    @Column(name = "number_of_views")
    private Integer numberOfViews;
    @Basic
    @Column(name = "is_del")
    private Integer isDel;


}
