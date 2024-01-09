package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.ToString;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.Locale;

@Data
public class UserInfo {
    private String name;
    private String userName;
    private String phonenumber;
    private int sex;
}
