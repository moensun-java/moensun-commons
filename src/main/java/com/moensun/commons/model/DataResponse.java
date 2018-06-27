package com.moensun.commons.model;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/6/27
 * Time: 下午9:52
 */
public class DataResponse<T> extends BaseResponse {
    private T data;

    public DataResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
