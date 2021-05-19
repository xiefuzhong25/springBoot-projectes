package com.xiefuzhong.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiefuzhong.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    //dubbo:reference interface="" version="" check=false
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)//这个也是选alibaba的
    private StudentService studentService;

    @RequestMapping(value = "/student/count")
    public  @ResponseBody Object studentCount(){

        Integer allStudentCount = studentService.queryAllStudentCount();

        return "学生总人数为"+allStudentCount;
    }


}
