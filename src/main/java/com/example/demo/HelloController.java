package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.MyBean;
import com.example.demo.bean.MyTestBean;
import com.example.demo.controller.EditDataParams;
import com.example.demo.controller.PageInfo;
import com.example.demo.controller.Response;
import com.example.demo.dao.Menu;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.MenuEntity;
import com.example.demo.entity.UserEntity;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.*;
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Menu menu;

    public HelloController() {
        var context = new AnnotationConfigApplicationContext(MyTestBean.class);
        var myBean = context.getBean(MyBean.class);
        var myBeans = context.getBean(MyBean.class);
    }

    @RequestMapping(value = "getUserInfo", method = RequestMethod.GET)
    public Response<UserEntity> getUserInfo(String id) {
        Response<UserEntity> res = new Response<>();
        if (id == null) {
            res.error(null);
        }
        res.success(userMapper.getUserInfo(id));
        return res;
    }

    @RequestMapping(value = "editMenuData", method = RequestMethod.POST)
    public Response<Object> editMenuData(@RequestBody EditDataParams info) {
        Response<Object> res = new Response<>();
        if (info.id == null) {
            res.error(null);
        }
        menu.editMenuData(info.id, info.remark);
        res.success(null);
        return res;
    }
    @RequestMapping(value = "editMenuRemarkAll", method = RequestMethod.POST)
    public Response<Object> editMenuRemarkAll(@RequestBody EditDataParams info) {
        Response<Object> res = new Response<>();
        menu.editMenuRemarkAll(info);
        res.success(null);
        return res;
    }

    @RequestMapping(value = "/getMenuDetail", method = RequestMethod.GET)
    public Response<MenuEntity> getMenuDetail(String id) {
        Response<MenuEntity> res = new Response<>();
        if (id == null) {
            res.error(null);
            return res;
        }
        res.success(menu.getMenuDetail(id));
        return res;
    }
    //批量修改备注
    @RequestMapping(value = "/getMenuList", method = RequestMethod.GET)
    public Response<Map<String, Object>> getMenuList(@RequestParam(defaultValue = "10") Integer pageSize, @RequestParam(defaultValue = "1") Integer pageNum) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPages(pageNum);
        pageInfo.setTotal(menu.getMenuListTotal());
        Map<String, Object> result = new HashMap<>();
        List<MenuEntity> list = menu.getMenuList(pageSize, (pageNum -1) * pageSize);
        result.put("list", list);
        result.put("pageInfo", pageInfo);
        Response<Map<String, Object>> res = new Response<>();
        res.success(result);
        return res;
    }

    @RequestMapping(value = "/addMenu", method = RequestMethod.POST)
    public Response<Object> addMenu(@RequestBody MenuEntity params) {
        Response<Object> res = new Response<>();
        Random random = new Random();
        int minValue = 1000;
        int maxValue = 100000;
        long id = random.nextInt(maxValue - minValue + 1) + minValue;
        params.setMenuId(id);
        System.out.print(params.toString());
        menu.addMenu(params);
        res.success(null);
        return res;
    }

    @RequestMapping(value = "/getDataList", method = RequestMethod.GET)
    public Response<Map<String, Object>> getDataList() {
        PageInfo pageInfo = new PageInfo();
        Map<String, Object> result = new HashMap<>();
        result.put("list", userMapper.getAll());
        result.put("pageInfo", pageInfo);
        Response<Map<String, Object>> res = new Response<>();
        res.success(result);
        return res;
    }
}