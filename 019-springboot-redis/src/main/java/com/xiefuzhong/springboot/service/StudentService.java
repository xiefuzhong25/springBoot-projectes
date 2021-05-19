package com.xiefuzhong.springboot.service;

 public interface StudentService {

//    操作redis的一个方法
    void put(String key, String value);
//从redis中获取指定key的值
     String get(String key);
 }
