package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j  //声明式注解日志对象
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody String studentCount(){

        log.info("查询当前学生人数");

        Integer count = studentService.queryStudentCount();
        return "学生总人数为："+ count;
    }


}
