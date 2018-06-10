package com.moensun.commons.model;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/6/10
 * Time: 下午1:42
 */
public class MSPageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int pageNum;
    private int pageSize;
    private int size;
    private int startRow;
    private int endRow;
    private long total;
    private int pages;
    private List<T> list;
    private int prePage;
    private int nextPage;
    private boolean isFirstPage;
    private boolean isLastPage;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private int[] navigatepageNums;
    private int navigateFirstPage;
    private int navigateLastPage;

    public MSPageInfo() {
    }

    public MSPageInfo(PageInfo<T> pageInfo) {
        this.setPageNum(pageInfo.getPageNum());
        this.setPageSize(pageInfo.getPageSize());
        this.setSize(pageInfo.getSize());
        this.setStartRow(pageInfo.getStartRow());
        this.setEndRow(pageInfo.getEndRow());
        this.setTotal(pageInfo.getTotal());
        this.setPages(pageInfo.getPages());
        this.setList(pageInfo.getList());
        this.setPrePage(pageInfo.getPrePage());
        this.setNextPage(pageInfo.getNextPage());
        this.setFirstPage(pageInfo.isIsFirstPage());
        this.setLastPage(pageInfo.isIsLastPage());
        this.setHasPreviousPage(pageInfo.isHasPreviousPage());
        this.setHasNextPage(pageInfo.isHasNextPage());
        this.setNavigatePages(pageInfo.getNavigatePages());
        this.setNavigatepageNums(pageInfo.getNavigatepageNums());
        this.setNavigateFirstPage(pageInfo.getNavigateFirstPage());
        this.setNavigateLastPage(pageInfo.getNavigateLastPage());
    }


    public MSPageInfo(Page<T> page) {
        this.setPageNum(page.getNumber());
        this.setPageSize(page.getSize());
        this.setTotal(page.getTotalElements());
        this.setPages(page.getTotalPages());
        this.setList(page.getContent());
        this.setFirstPage(page.isFirst());
        this.setLastPage(page.isLast());
        this.setHasPreviousPage(page.hasPrevious());
        this.setHasNextPage(page.hasNext());
    }

    //region Getter Setter
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public void setNavigatePages(int navigatePages) {
        this.navigatePages = navigatePages;
    }

    public int[] getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(int[] navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    public int getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public void setNavigateFirstPage(int navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
    }

    public int getNavigateLastPage() {
        return navigateLastPage;
    }

    public void setNavigateLastPage(int navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
    }
    //endregion
}
