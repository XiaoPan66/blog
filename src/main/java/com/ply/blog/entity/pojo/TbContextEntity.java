package com.ply.blog.entity.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_context", schema = "blog")
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
    private int numberOfViews;
    @Basic
    @Column(name = "is_del")
    private int isDel;

    public int getContextId() {
        return contextId;
    }

    public void setContextId(int contextId) {
        this.contextId = contextId;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbContextEntity that = (TbContextEntity) o;
        return contextId == that.contextId && userId == that.userId && numberOfViews == that.numberOfViews && isDel == that.isDel && Objects.equals(contextName, that.contextName) && Objects.equals(image, that.image) && Objects.equals(tagId, that.tagId) && Objects.equals(context, that.context) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contextId, contextName, image, tagId, userId, context, createTime, updateTime, numberOfViews, isDel);
    }
}
