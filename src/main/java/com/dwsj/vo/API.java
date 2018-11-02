package com.dwsj.vo;

public class API {
    private Integer code;
    private String msg;
    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public API(Integer code, String msg, String data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
