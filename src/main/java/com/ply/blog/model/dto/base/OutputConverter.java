package com.ply.blog.model.dto.base;

import com.ply.blog.utils.BeanUtils;
import org.springframework.lang.NonNull;

/**
 * @author LongYU
 * @Date 2022/7/17 23:00
 * <p>
 * <p>
 * Converter interface for output DTO.
 */
public interface OutputConverter<DtoT extends OutputConverter<DtoT, D>, D> {

    //    todo 类型转化
    @SuppressWarnings("unchecked")
    @NonNull
    default <T extends DtoT> T converterFrom(@NonNull D domain) {
        BeanUtils.updateProperties(domain, this);
        return (T) this;
    }
}
