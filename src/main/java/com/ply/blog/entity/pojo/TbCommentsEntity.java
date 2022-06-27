package com.ply.blog.entity.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_comments", schema = "blog")
public class TbCommentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "comment_id")
    private Integer commentId;
    @Basic
    @Column(name = "up_comment_id")
    private Integer upCommentId;
    @Basic
    @Column(name = "context_id")
    private Integer contextId;
    @Basic
    @Column(name = "comments")
    private String comments;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "is_del")
    private Integer isDel;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Integer getUpCommentId() {
        return upCommentId;
    }

    public void setUpCommentId(Integer upCommentId) {
        this.upCommentId = upCommentId;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbCommentsEntity that = (TbCommentsEntity) o;
        return commentId == that.commentId && Objects.equals(upCommentId, that.upCommentId) && Objects.equals(contextId, that.contextId) && Objects.equals(comments, that.comments) && Objects.equals(createTime, that.createTime) && Objects.equals(status, that.status) && Objects.equals(isDel, that.isDel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, upCommentId, contextId, comments, createTime, status, isDel);
    }
}
