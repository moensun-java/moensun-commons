package com.moensun.commons.util;

import com.github.pagehelper.PageInfo;
import com.moensun.commons.model.MSPageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/6/10
 * Time: 下午1:49
 */
public class MSPageInfoUtils {

    public static <T> MSPageInfo<T> msPageInfo(PageInfo<T> pageInfo){
        MSPageInfo<T> bean = new MSPageInfo<>();
        bean.setPageNum(pageInfo.getPageNum());
        bean.setPageSize(pageInfo.getPageSize());
        bean.setSize(pageInfo.getSize());
        bean.setStartRow(pageInfo.getStartRow());
        bean.setEndRow(pageInfo.getEndRow());
        bean.setTotal(pageInfo.getTotal());
        bean.setPages(pageInfo.getPages());
        bean.setList(pageInfo.getList());
        bean.setPrePage(pageInfo.getPrePage());
        bean.setNextPage(pageInfo.getNextPage());
        bean.setFirstPage(pageInfo.isIsFirstPage());
        bean.setLastPage(pageInfo.isIsLastPage());
        bean.setHasPreviousPage(pageInfo.isHasPreviousPage());
        bean.setHasNextPage(pageInfo.isHasNextPage());
        bean.setNavigatePages(pageInfo.getNavigatePages());
        bean.setNavigatepageNums(pageInfo.getNavigatepageNums());
        bean.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        bean.setNavigateLastPage(pageInfo.getNavigateLastPage());
        return bean;
    }

    public static <T,E> MSPageInfo<E> msPageInfo(MSPageInfo<T> pageInfo, List<E> data){
        MSPageInfo<E> bean = new MSPageInfo<>();
        bean.setPageNum(pageInfo.getPageNum());
        bean.setPageSize(pageInfo.getPageSize());
        bean.setSize(pageInfo.getSize());
        bean.setStartRow(pageInfo.getStartRow());
        bean.setEndRow(pageInfo.getEndRow());
        bean.setTotal(pageInfo.getTotal());
        bean.setPages(pageInfo.getPages());
        bean.setList(data);
        bean.setPrePage(pageInfo.getPrePage());
        bean.setNextPage(pageInfo.getNextPage());
        bean.setFirstPage(pageInfo.isFirstPage());
        bean.setLastPage(pageInfo.isLastPage());
        bean.setHasPreviousPage(pageInfo.isHasPreviousPage());
        bean.setHasNextPage(pageInfo.isHasNextPage());
        bean.setNavigatePages(pageInfo.getNavigatePages());
        bean.setNavigatepageNums(pageInfo.getNavigatepageNums());
        bean.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        bean.setNavigateLastPage(pageInfo.getNavigateLastPage());
        return bean;
    }

    public static <T,E> MSPageInfo<E> msPageInfo(PageInfo<T> pageInfo, List<E> data){
        MSPageInfo<E> bean = new MSPageInfo<>();
        bean.setPageNum(pageInfo.getPageNum());
        bean.setPageSize(pageInfo.getPageSize());
        bean.setSize(pageInfo.getSize());
        bean.setStartRow(pageInfo.getStartRow());
        bean.setEndRow(pageInfo.getEndRow());
        bean.setTotal(pageInfo.getTotal());
        bean.setPages(pageInfo.getPages());
        bean.setList(data);
        bean.setPrePage(pageInfo.getPrePage());
        bean.setNextPage(pageInfo.getNextPage());
        bean.setFirstPage(pageInfo.isIsFirstPage());
        bean.setLastPage(pageInfo.isIsLastPage());
        bean.setHasPreviousPage(pageInfo.isHasPreviousPage());
        bean.setHasNextPage(pageInfo.isHasNextPage());
        bean.setNavigatePages(pageInfo.getNavigatePages());
        bean.setNavigatepageNums(pageInfo.getNavigatepageNums());
        bean.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        bean.setNavigateLastPage(pageInfo.getNavigateLastPage());
        return bean;
    }

    public static <T> MSPageInfo<T> msPageInfo(Page<T> page){
        MSPageInfo<T> bean = new MSPageInfo<>();
        bean.setPageNum(page.getNumber());
        bean.setPageSize(page.getSize());
        bean.setTotal(page.getTotalElements());
        bean.setPages(page.getTotalPages());
        bean.setList(page.getContent());
        bean.setFirstPage(page.isFirst());
        bean.setLastPage(page.isLast());
        bean.setHasPreviousPage(page.hasPrevious());
        bean.setHasNextPage(page.hasNext());
        return bean;
    }

    public static <T,E> MSPageInfo<E> msPageInfo(Page<T> page,List<E> data){
        MSPageInfo<E> bean = new MSPageInfo<>();
        bean.setPageNum(page.getNumber());
        bean.setPageSize(page.getSize());
        bean.setTotal(page.getTotalElements());
        bean.setPages(page.getTotalPages());
        bean.setList(data);
        bean.setFirstPage(page.isFirst());
        bean.setLastPage(page.isLast());
        bean.setHasPreviousPage(page.hasPrevious());
        bean.setHasNextPage(page.hasNext());
        return bean;
    }
}
