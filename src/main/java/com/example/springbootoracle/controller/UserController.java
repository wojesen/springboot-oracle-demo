package com.example.springbootoracle.controller;

import com.example.springbootoracle.entity.User;
import com.example.springbootoracle.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;


@Controller
@EnableAutoConfiguration
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user/select", method = RequestMethod.GET)
    public User selectUser() {
        return userService.select(1);
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.GET)
    public String deleteUser(int id) {
        userService.delete(id);
        return"ok";
    }

}
