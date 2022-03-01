package com.example.springbootoracle.service;

import com.example.springbootoracle.entity.User;

public interface UserService {

    //方法名对应xml里面的标签id
    Integer insert(User user);
    User select(Integer integer);
    int update(User user);
    int delete(int xId);

}
