package com.xiefuzhong.springboot.service.impl;

import com.xiefuzhong.springboot.mapper.StudentMapper;
import com.xiefuzhong.springboot.model.Student;
import com.xiefuzhong.springboot.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudenServiceImpl implements StudenService {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional  //添加事务
    @Override
    public int updateStudentById(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
        //失败【添加了事务会回滚，上面的也不会执行修改】
//        int a = 10/0;
        return i;
    }
}
