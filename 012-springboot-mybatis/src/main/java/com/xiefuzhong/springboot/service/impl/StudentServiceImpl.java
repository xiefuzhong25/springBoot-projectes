package com.xiefuzhong.springboot.service.impl;

import com.xiefuzhong.springboot.mapper.StudentMapper;
import com.xiefuzhong.springboot.model.Student;
import com.xiefuzhong.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
