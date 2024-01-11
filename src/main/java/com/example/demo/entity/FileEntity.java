package com.example.demo.entity;

import lombok.Data;

@Data
public class FileEntity {
    private Long id;
    private String url;
    private Long size;
    private String name;
}
