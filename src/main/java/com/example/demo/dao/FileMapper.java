package com.example.demo.dao;

import com.example.demo.entity.FileEntity;

import java.util.List;

public interface FileMapper {
    void saveImage(FileEntity data);
    List<FileEntity> getImagesList();
    void delImage(Long id);
}
