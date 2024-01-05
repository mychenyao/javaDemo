package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.Locale;

public class UserInfo {
    public String name;
    public String userName;
    public String phonenumber;
    public int sex;


    public void setValue() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUserName(String name) {
        this.userName = name;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
}
