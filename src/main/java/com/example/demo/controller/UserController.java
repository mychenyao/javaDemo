package com.example.demo.controller;


import com.example.demo.dao.DeptMapper;
import com.example.demo.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private DeptMapper deptMapper;

    @RequestMapping(value ="/getDeptAndUserListAll", method = RequestMethod.GET)
    public List<DeptEntity> getDeptAndUserListAll() {

        return deptMapper.getDeptAndUserListAll();
    }
}
