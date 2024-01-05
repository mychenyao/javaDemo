package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import java.util.*;

public interface UserMapper {
    List<UserEntity> getAll();
    UserEntity getUserInfo(String id);
}
