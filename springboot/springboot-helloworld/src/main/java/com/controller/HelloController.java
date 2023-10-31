package com.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：程序员李影
 * 日期：2023/10/31 20:59
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot !";
    }

}
