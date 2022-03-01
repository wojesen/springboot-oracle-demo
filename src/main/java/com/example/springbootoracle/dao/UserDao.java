package com.example.springbootoracle.dao;

import com.example.springbootoracle.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int insert(User user);  //方法名对应xml里面的标签id
    User select(Integer integer);
    int update(User user);
    int delete(int xId);
}
