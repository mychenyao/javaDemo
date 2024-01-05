package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.logging.SimpleFormatter;


@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Date date = new Date();
        SimpleDateFormat currentDate = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        System.out.print(currentDate.format(date));
    }
}
