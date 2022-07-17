package com.ply.blog.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author LongYU
 * @Date 2022/7/12 21:17
 */

@Entity(name = "Post")
@DiscriminatorValue(value = "0")
public class Post extends BasePost{
}
