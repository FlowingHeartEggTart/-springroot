package com.example.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 功能：
 * 作者：程序员李影
 * 日期：2023/10/29 21:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Result {
    public static final String CODE_SUCCESS="200";
    public static final String CODE_AUTH_ERROR="401";
    public static final String CODE_SYS_ERROR="500";
    /**
     * 请求的返回编码 200 401 404 500
     * 编码表示这次请求是成功还是失败
     * 或者说可以看出失败的类型是什么
     */
    private String code;
    /**
    *msg表示错误的详细信息
     */
    private String msg;
    /**
     *date表示数据返回的地方
     */
    private Object date;
    public static Result success(){
        return new Result(CODE_SUCCESS, msg,"请求成功", date:null);
    }
    public static Result success(Object date){
        return new Result(CODE_SUCCESS, msg,"请求成功", date);
    }
    public static Result error(String msg){
        return new Result(CODE_SUCCESS, msg, date:null);
    }
    public static Result error(String code,String msg){
        return new Result(CODE_SYS_ERROR, msg, date:null);
    }
    public static Result error(){
        return new Result(CODE_SYS_ERROR, mag: "系统错误", date:null);
    }
    git add
            
}
