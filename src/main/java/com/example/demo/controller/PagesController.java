package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class PagesController {
    @Autowired
    private ResourceLoader resourceLoader; // 注入ResourceLoader对象
    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
