package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * 功能：
 * 作者：程序员李影
 * 日期：2023/10/31 22:19
 */
public class LoginController {
    @RequestMapping("login")
    public String login(){
        return "登陆成功！";
    }
}
