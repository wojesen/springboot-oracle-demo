package com.example.springbootoracle;

import com.example.springbootoracle.dao.UserDao;
import com.example.springbootoracle.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
class SpringbootOracleApplicationTests {

    @Resource
    private UserDao userDao;


    @Test
    void testSelect() {
       User user =userDao.select(2);
        System.out.println(user);
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setxId(4);
        user.setxName("hfgdh");
        user.setxAge(56);
        userDao.insert(user);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setxId(4);
        user.setxName("夏2");
        userDao.update(user);
    }

    @Test
    void testDelete() {
        userDao.delete(3);
    }

}
