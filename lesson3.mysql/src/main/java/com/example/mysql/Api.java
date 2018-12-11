package com.example.mysql;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @RequestMapping
    public String index() {
        return "我们都是好孩子";
    }
}
