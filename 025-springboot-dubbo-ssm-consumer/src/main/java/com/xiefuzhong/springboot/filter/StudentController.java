package com.xiefuzhong.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiefuzhong.springboot.model.Student;
import com.xiefuzhong.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class StudentController {

    //是dubbo的注解,也是注入,他一般注入的是分布式的远程服务的对象
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public  String studentDetail(
            Model model,
            @PathVariable("id") Integer id){
       Student student = studentService.querystudentById(id);
        model.addAttribute("student",student);

        return  "studentDetail";
    }


//    =============================================使用redis知识===================================

    @RequestMapping(value = "/student/all/count")
    public  @ResponseBody Object allStudent(){
        Integer count =  studentService.queryAllStudentCount();
        return  "学生中人数为："+count;
    }

}
