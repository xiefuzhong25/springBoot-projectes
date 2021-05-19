package com.xiefuzhong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot项目启动入口类
@SpringBootApplication   //springboot核心注解，主要用于开启spring自动配置
public class Application {

    //springboot项目代码必须放到Application类所在的同级目录或者下级目录

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
