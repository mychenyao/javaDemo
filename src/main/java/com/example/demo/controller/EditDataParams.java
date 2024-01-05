package com.example.demo.controller;


import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@Controller
public class EditDataParams {
    public String remark;
    public String id;
}
