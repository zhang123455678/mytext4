package com.zhangzilin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzilin
 * @date 2018/10/28 16:53
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public String startDemo(){
        System.out.println("访问userController方法!!");
        return "访问成功,好好学习!!!123";
    }
}
