package com.ply.blog.utils;

import com.ply.blog.exception.BeanUtilsException;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.beans.PropertyDescriptor;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author LongYU
 * @Date 2022/7/21 21:27
 */
public class BeanUtils {

    private BeanUtils() {
    }

    @Nullable
    public static <T> T transformFrom(@Nullable Object source, @NonNull Class<T> targetClass) {
        Assert.notNull(targetClass, "Target class must not be null");
        if (source == null) {
            return null;
        }

        try {
            T targetInstance = targetClass.newInstance();

            org.springframework.beans.BeanUtils.copyProperties(source, targetInstance, getNullPropertyNames(source));

            return targetInstance;
        } catch (Exception e) {
            throw new BeanUtilsException("Failed to new " + targetClass.getName() + " instance or copy properties", e);
        }
    }

    @NonNull
    public static <T> List<T> transformFromInBatch(@Nullable Collection<?> sources, @NonNull Class<T> targetClass) {

        if (CollectionUtils.isEmpty(sources)) {
            return  Collections.emptyList();
        }

        return sources
                .stream()
                .map(source -> transformFrom(source,targetClass))
                .collect(Collectors.toList());
    }


    public static void updateProperties(@NonNull Object source, @NonNull Object target) {
        Assert.notNull(source, "source object must not be null");
        Assert.notNull(target, "target object must not be null");

        // Set non null properties from source properties to target properties
        try {
            org.springframework.beans.BeanUtils
                    .copyProperties(source, target, getNullPropertyNames(source));
        } catch (BeansException e) {
            throw new BeanUtilsException("Failed to copy properties", e);
        }
    }



    @NonNull
    private static String[] getNullPropertyNames(@NonNull Object source) {
        return getNullPropertyNameSet(source).toArray(new String[0]);
    }

    /**
     * 为null的字段
     */
    @NonNull
    private static Set<String> getNullPropertyNameSet(@NonNull Object source) {

        Assert.notNull(source, "source class must not be null");
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(source);

        PropertyDescriptor[] propertyDescriptors = beanWrapper.getPropertyDescriptors();
        Set<String> emptyNames = new HashSet<>();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String name = propertyDescriptor.getName();
            Object propertyValue = beanWrapper.getPropertyValue(name);

            if (propertyValue == null) {
                emptyNames.add(name);
            }
        }
        return emptyNames;
    }
}