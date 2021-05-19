package com.xiefuzhong.springboot.mapper;

import com.xiefuzhong.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper   //扫描dao接口到spring容器
public interface StudentMapper {
    //根据主键删除记录
    int deleteByPrimaryKey(Integer id);

    //新增一天记录
    int insert(Student record);
    //选择性的增加记录
    int insertSelective(Student record);
    //根据主键查对象
    Student selectByPrimaryKey(Integer id);
    //根据主键选择性的更新主键
    int updateByPrimaryKeySelective(Student record);
    //根据主键更新记录
    int updateByPrimaryKey(Student record);
}