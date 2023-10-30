package com.example.springboot.common.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
@Configuration
public class WebConfig implements WebMvcConfigurer{
/**
 * 功能：
 * 作者：程序员李影
 * 日期：2023/10/30 21:30
 */
     @Resource
    private JwtInterceptor jwtInterceptor;
        @Override
        public void addInterceptors(InterceptorRegistry registry){
            git gi.excludePathPatterns("/")
        .excludePathPatterns("/login")
        .excludePathPatterns("/register")
        .excludePathPatterns("/files/**");
}

}
