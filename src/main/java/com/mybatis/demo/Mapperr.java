package com.mybatis.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Mapperr {
    public List list();
    public void insert(Test test);
}
