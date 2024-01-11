package com.example.demo.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer userId;
    private Integer deptId;
    private String userName;
    private String userType;
    private String loginName;
    private String email;
    private String phonenumber;
    private String sex;
    private String remark;
}
