package com.hust.travel.vo;

import lombok.Data;

@Data
public class ResultData<T> {

    private int code;

    private String msg;

    private T data;

    public ResultData(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
