package com.example.springbootoracle.service.impl;

import com.example.springbootoracle.dao.UserDao;
import com.example.springbootoracle.entity.User;
import com.example.springbootoracle.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public Integer insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public User select(Integer integer) {
        return userDao.select(integer);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(int xId) {
        return userDao.delete(xId);
    }
}
