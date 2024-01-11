package com.example.demo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description 部门表
 * @author zhengkai.blog.csdn.net
 * @date 2024-01-11
 */
@Data
public class DeptEntity {
        /**
         * 部门id
         */
        private Integer deptId;

        /**
         * 父部门id
         */
        private Long parentId;

        /**
         * 祖级列表
         */
        private String ancestors;

        /**
         * 部门名称
         */
        private String deptName;

        /**
         * 显示顺序
         */
        private Integer orderNum;

        /**
         * 负责人
         */
        private String leader;

        /**
         * 联系电话
         */
        private String phone;

        /**
         * 邮箱
         */
        private String email;

        /**
         * 部门状态（0正常 1停用）
         */
        private String status;

        /**
         * 删除标志（0代表存在 2代表删除）
         */
        private String delFlag;

        /**
         * 创建者
         */
        private String createBy;

        /**
         * 创建时间
         */
        private Date createTime;

        /**
         * 更新者
         */
        private String updateBy;

        /**
         * 更新时间
         */
        private Date updateTime;

        private List<UserEntity> userList;

    /*
    * CREATE TABLE `sys_dept` (
  `dept_id` bigint NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `parent_id` bigint DEFAULT '0' COMMENT '父部门id',
  `ancestors` varchar(50) COLLATE utf8_bin DEFAULT '' COMMENT '祖级列表',
  `dept_name` varchar(30) COLLATE utf8_bin DEFAULT '' COMMENT '部门名称',
  `order_num` int DEFAULT '0' COMMENT '显示顺序',
  `leader` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '负责人',
  `phone` varchar(11) COLLATE utf8_bin DEFAULT NULL COMMENT '联系电话',
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `status` char(1) COLLATE utf8_bin DEFAULT '0' COMMENT '部门状态（0正常 1停用）',
  `del_flag` char(1) COLLATE utf8_bin DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin COMMENT='部门表';
    * */
}
