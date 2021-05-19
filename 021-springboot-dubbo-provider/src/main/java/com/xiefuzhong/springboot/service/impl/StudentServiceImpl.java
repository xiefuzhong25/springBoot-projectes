package com.xiefuzhong.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiefuzhong.springboot.service.StudentService;
import org.springframework.stereotype.Component;


@Component //将这个类交给spring容器管理
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)    //一定要使用alibaba的那个
public class StudentServiceImpl implements StudentService {

    @Override
    public Integer queryAllStudentCount() {

        //调用数据持久层后

        return 10000;
    }
}
