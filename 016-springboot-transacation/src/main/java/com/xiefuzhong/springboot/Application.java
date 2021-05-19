package com.xiefuzhong.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.xiefuzhong.springboot.mapper")
@EnableTransactionManagement  //开启事务（springboot2.0以后可选项）
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
