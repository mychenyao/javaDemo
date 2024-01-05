package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

public class Response {
    public String msg="操作成功";
    public Boolean success = true;
    public int code = 200;
//    public List<Object> list;
    public Object result;
    public Response(int code, Object result) {
        if (code == 200){
            this.msg="操作成功";
            this.success=true;
        } else {
            this.msg="系统未知错误";
            this.success=false;
        }
        this.result = result;
        this.code = code;
    }
}
