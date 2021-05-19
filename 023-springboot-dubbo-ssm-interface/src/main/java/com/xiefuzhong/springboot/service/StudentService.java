package com.xiefuzhong.springboot.service;

import com.xiefuzhong.springboot.model.Student;

public interface StudentService {

    Student querystudentById(Integer id);

    Integer queryAllStudentCount();
}
