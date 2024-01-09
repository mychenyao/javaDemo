package com.example.demo.controller;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Response <T> {
    private String msg;
    private Boolean status;
    private int code;
    private T result;
    public void success(T data) {
        this.code = 200;
        this.status = true;
        this.result = data;
        this.msg = "操作成功";
    }
    public void error(T data) {
        this.code = 500;
        this.result = data;
        this.status = false;
        this.msg = "系统未知错误";
    }
}
