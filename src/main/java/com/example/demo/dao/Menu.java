package com.example.demo.dao;

import com.example.demo.entity.MenuEntity;
import org.springframework.lang.Nullable;

import java.util.*;

public interface Menu {
    MenuEntity getMenuDetail(String id);
    List<MenuEntity> getMenuList(Integer pageSize, Integer pageNum);
    void editMenuData(String id, String remark);
    Integer getMenuListTotal();
}
