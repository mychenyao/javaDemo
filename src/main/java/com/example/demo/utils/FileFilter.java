package com.example.demo.utils;

public class FileFilter {
    public static Boolean FilterImage(String fileName) {
        String name = fileName.toLowerCase();
        return name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".gif");
    }
}
