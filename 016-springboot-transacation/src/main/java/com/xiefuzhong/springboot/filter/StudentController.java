package com.xiefuzhong.springboot.web;

import com.xiefuzhong.springboot.model.Student;
import com.xiefuzhong.springboot.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudenService studenService;

    @RequestMapping(value = "/update")
    public @ResponseBody Object update(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int count = studenService.updateStudentById(student);

        return "修改学生编号为"+id+"的姓名修改结果："+count;
    }
}
