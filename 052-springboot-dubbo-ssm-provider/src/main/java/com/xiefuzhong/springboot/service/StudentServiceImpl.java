package com.xiefuzhong.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiefuzhong.springboot.mapper.StudentMapper;
import com.xiefuzhong.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //交给spring容器管理
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)//server记得用dubbo那个【此处是为了暴露接口】
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
