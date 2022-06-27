package com.ply.blog.entity.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_tag", schema = "blog")
public class TbTagEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tag_id")
    private Integer tagId;
    @Basic
    @Column(name = "tag_name")
    private String tagName;
    @Basic
    @Column(name = "is_del")
    private int isDel;

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
        TbTagEntity that = (TbTagEntity) o;
        return tagId == that.tagId && isDel == that.isDel && Objects.equals(tagName, that.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagName, isDel);
    }
}
