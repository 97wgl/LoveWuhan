package com.hust.travel.vo;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    private Result() {
    }

    private Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Result(ResultTypeEnum type) {
        this.code = type.getCode();
        this.msg = type.getMessage();
    }

    private Result(ResultTypeEnum type, T data) {
        this.code = type.getCode();
        this.msg = type.getMessage();
        this.data = data;
    }

    public static Result success() {
        return new Result(ResultTypeEnum.SERVICE_SUCCESS);
    }

    public static <T> Result<T> success(T data) {
        return new Result(ResultTypeEnum.SERVICE_SUCCESS, data);
    }

    public static <T> Result<T> success(int code, String msg) {
        return new Result(code, msg);
    }

    public static  <T> Result<T> success(int code, String msg, T data) {
        return new Result(code, msg, data);
    }

    public static Result error() {
        return new Result(ResultTypeEnum.SERVICE_ERROR);
    }

    public static Result error(ResultTypeEnum typeEnum) {
        return new Result(typeEnum);
    }

    public static Result error(int code, String msg) {
        return new Result(code, msg);
    }

    public static Result error(ResultTypeEnum typeEnum,String msg) {
        return new Result(typeEnum,msg);
    }

    public static <T> Result<T> error(T data) {
        return new Result(ResultTypeEnum.SERVICE_ERROR, data);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}