package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.dao.FileMapper;
import com.example.demo.entity.FileEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ResourceLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FileController {
    @Autowired
    private FileMapper fileMapper;
    private final String domain = "http://localhost:1314/files/";
//    private final String filePath = System.getProperty("user.dir") + "/src/main/resources/files/";
    private final String filePath = "/usr/local/var/www/static/files/"; // nginx目录
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public Response<?> uploadFile(@RequestBody MultipartFile file) {
        String fileName = file.getOriginalFilename();
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileEntity resData = new FileEntity();
        resData.setName(fileName);
        resData.setSize(file.getSize());
        resData.setUrl(domain + fileName);
        var res = new Response<>();
        res.setResult(resData);
        fileMapper.saveImage(resData);
        return res;
    }
    @RequestMapping(value = "/getFileList", method = RequestMethod.GET)
    public Response<?> getFileList() {
        var res = new Response<>();
        res.setResult(fileMapper.getImagesList());
        return res;
    }
    @RequestMapping(value = "/delImage", method = RequestMethod.POST)
    public Response<?> delImage(@RequestBody FileEntity param) {
        var res = new Response<>();
        var dataList = fileMapper.getImagesList();
        for(FileEntity val: dataList) {
            if (val.getId() == param.getId()) {
                var file = new File(filePath + val.getName());
                file.delete();
            }
        }
        fileMapper.delImage(param.getId());
        res.setResult(null);
        return res;
    }

}
