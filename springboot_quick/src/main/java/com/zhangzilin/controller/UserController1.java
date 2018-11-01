package com.zhangzilin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzilin
 * @date 2018/10/28 16:53
 */
@RestController
public class UserController1 {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private String age;

    @Value("${person.addr}")
    private String addr;


    @RequestMapping("/user1")
    public String startDemo(){
        System.out.println("访问userController方法!!");
        return "访问成功,好好学习!!! name="+name+"  age="+age+"     addr="+addr;
    }
}
