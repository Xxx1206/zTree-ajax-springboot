package com.example.ztree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ztree.dao")
//在接口类上添加了@Mapper，在编译之后会生成相应的接口实现类
//com.example.ztree.dao包下面的接口类，在编译之后都会生成相应的实现类

public class ZtreeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZtreeApplication.class, args);
    }
}
