package com.zhangzilin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzilin
 * @date 2018/10/28 16:53
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class UserController2 {

    private String name;

    private String age;

    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("/user2")
    public String startDemo(){
        System.out.println("访问userController2方法!!");
        return "访问成功,好好学习!!! name="+name+"  age="+age+"     addr="+addr;
    }
}
