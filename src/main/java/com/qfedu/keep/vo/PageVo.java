package com.qfedu.keep.vo;

import java.util.List;

public class PageVo<T> {
    private Integer code;
    private String msg;
    private List<T> data;

    public PageVo(Integer code, String msg, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public PageVo() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public static <E> PageVo creatJson (int code, String msg, List<E> data) {
        PageVo<E> result = new PageVo<E>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
