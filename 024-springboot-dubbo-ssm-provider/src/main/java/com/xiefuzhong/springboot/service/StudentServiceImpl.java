package com.xiefuzhong.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiefuzhong.springboot.mapper.StudentMapper;
import com.xiefuzhong.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired   //redis的模板对象
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public Student querystudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        //首先去redis缓存中查询，如果有：直接使用，如果没有就去数据库查并且放到redis缓存中

        Integer count = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if (null==count){
            //如果没有就去数据库里面查
             count = studentMapper.getAllStudentCount();
             //并且放到redis缓存中[可以选择是否设置有效期]
            redisTemplate.opsForValue().set("allStudentCount",count,120, TimeUnit.SECONDS);
        }

        return count;
    }
}
