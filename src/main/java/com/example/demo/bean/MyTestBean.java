package com.example.demo.bean;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyTestBean {
    @Bean
    public MyBean initMyBean() {
        return new MyBean();
    }
}
