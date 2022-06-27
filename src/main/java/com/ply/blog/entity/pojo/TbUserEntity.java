package com.ply.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_user", schema = "blog")
@AllArgsConstructor
@NoArgsConstructor
public class TbUserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "pwd")
    private String pwd;
    @Basic
    @Column(name = "mailbox")
    private String mailbox;
    @Basic
    @Column(name = "avatar")
    private String avatar;
    @Basic
    @Column(name = "create_time")
    private Date createTime;
    @Basic
    @Column(name = "update_time")
    private Date updateTime;
    @Basic
    @Column(name = "user_introduction")
    private String userIntroduction;
    @Basic
    @Column(name = "is_del")
    private int isDel;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
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
        TbUserEntity that = (TbUserEntity) o;
        return userId == that.userId && isDel == that.isDel && Objects.equals(userName, that.userName) && Objects.equals(pwd, that.pwd) && Objects.equals(mailbox, that.mailbox) && Objects.equals(avatar, that.avatar) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime) && Objects.equals(userIntroduction, that.userIntroduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, pwd, mailbox, avatar, createTime, updateTime, userIntroduction, isDel);
    }
}
