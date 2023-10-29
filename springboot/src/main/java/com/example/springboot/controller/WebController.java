package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：提供接口返回数据
 * 作者：程序员李影
 * 日期：2023/10/29 21:00
 */
@RestController
public class WebController {

    @RequestMapping
    public String hello(){


        return "Hello 小王同学";

    }
}
