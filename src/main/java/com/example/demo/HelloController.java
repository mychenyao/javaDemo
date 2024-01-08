package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.controller.EditDataParams;
import com.example.demo.controller.Response;
import com.example.demo.dao.Menu;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.*;

@RestController
public class HelloController {
//    @Autowired

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Menu menu;

    @RequestMapping(value = "getUserInfo", method = RequestMethod.GET)
    public Response getUserInfo(String id) {
        Response res = new Response(200, userMapper.getUserInfo(id));
        return res;
    }

    @RequestMapping(value = "editMenuData", method = RequestMethod.POST)
    public Response editMenuData(@RequestBody EditDataParams info) {
        if (info.id == null) {
            return new Response(500, null);
        }
        menu.editMenuData(info.id, info.remark);
        return new Response(200, null);
    }

    @RequestMapping(value = "/getMenuDetail", method = RequestMethod.GET)
    public Response getMenuDetail(String id) {
        if (id == null) {
            return new Response(500, null);
        }
        return new Response(200, menu.getMenuDetail(id));
    }

    @RequestMapping(value = "/getMenuList", method = RequestMethod.GET)
    public Response getMenuList() {
        return new Response(200, menu.getMenuList());
    }


    @RequestMapping(value = "/getDataList", method = RequestMethod.GET)
    public Response getDataList() {
        return new Response(200, userMapper.getAll());
    }
}