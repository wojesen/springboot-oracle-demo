package com.example.springbootoracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootoracle.dao")
//在接口类上添加了@Mapper，在编译之后会生成相应的接口实现类
//com.example.springbootoracle.dao包下面的接口类，在编译之后都会生成相应的实现类

public class SpringbootOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOracleApplication.class, args);
    }

}
