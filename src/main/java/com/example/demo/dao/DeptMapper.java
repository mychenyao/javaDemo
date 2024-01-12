package com.example.demo.dao;

import com.example.demo.entity.DeptEntity;
import com.example.demo.entity.UserEntity;

import java.util.List;

public interface DeptMapper {
    List<DeptEntity> getDeptAndUserListAll();
}
