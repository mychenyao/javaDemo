package com.example.demo.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer userId;
    private String userName;
    private String userType;
    private String password;
    private String remark;
}
