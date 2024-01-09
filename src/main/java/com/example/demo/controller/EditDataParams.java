package com.example.demo.controller;


import lombok.Data;
import org.springframework.stereotype.Controller;

import java.util.List;

@Data
@Controller
public class EditDataParams {
    public String remark;
    public String id;
    public List<Long> idList;
}
