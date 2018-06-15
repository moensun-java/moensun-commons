package com.moensun.commons.util;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/5/22
 * Time: 下午7:00
 */
public class ListUtils {

    public static <T> List<T> criteriaRetain(List<T> source, List<T> target){
        if(CollectionUtils.isEmpty(source)){
            return Lists.newLinkedList();
        }
        if(CollectionUtils.isEmpty(target)){
            return source;
        }else {
            source.retainAll(target);
            return source;
        }
    }

}
