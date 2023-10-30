package com.example.springboot.controller;

import com.example.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/business")

/**
 * 功能：商家管理相关接口
 * 作者：程序员李影
 * 日期：2023/10/30 20:55
 */
public class BusinessController {
    @GetMapping("/selectAll")
    public Result selectAll() {
        return Result.success();
    }
}
