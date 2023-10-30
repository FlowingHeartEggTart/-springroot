package com.example.springboot.controller;

import com.example.springboot.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 功能：提供接口返回数据
 * 作者：程序员李影
 * 日期：2023/10/29 21:00
 */
public class WebConfig implements WebMvcConfigurer{
@Resource
private jwtInterceptor jwtInterceptor;
@Override
public void addInterceptor(InterceptorRegistry registry){
        registry.addInterceptor(jwtInterceptor).addPathPatterns("/**")
        .excludePathPatterns("/")
        .excludePathPatterns("/login")
        .excludePathPatterns("/register")
        .excludePathPatterns("/files/**");
        }
        }
