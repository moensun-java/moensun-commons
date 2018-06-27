package com.moensun.commons.model;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/6/27
 * Time: 下午9:52
 */
public class PageResponse<T> extends BaseResponse {
    private List<T> data;



    public PageResponse() {
        super();
    }

    public PageResponse(List<T> data) {
        this.data = data;
    }

    public PageResponse(PageInfo<T> pageInfo) {
        this.data = pageInfo.getList();
        this.pageNum = pageInfo.getPageNum();
        this.pages = pageInfo.getPages();
        this.total = pageInfo.getTotal();
    }

    public PageResponse(Page<T> page){
        this.data = page.getContent();
        this.pageNum = page.getNumber();
        this.pages = page.getTotalPages();
        this.total = page.getTotalElements();
    }

    public PageResponse(MSPageInfo<T> msPageInfo){
        this.data = msPageInfo.getList();
        this.pageNum = msPageInfo.getPageNum();
        this.pages = msPageInfo.getPages();
        this.total = msPageInfo.getTotal();
    }


    private long total;
    private int pages;
    private int pageNum;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
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

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
