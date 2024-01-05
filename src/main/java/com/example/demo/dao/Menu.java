package com.example.demo.dao;

import com.example.demo.entity.MenuEntity;
import java.util.*;

public interface Menu {
    MenuEntity getMenuDetail(String id);
    List<MenuEntity> getMenuList();
    void editMenuData(String id, String remark);
}
