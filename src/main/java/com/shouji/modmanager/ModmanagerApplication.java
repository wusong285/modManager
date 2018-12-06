package com.shouji.modmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shouji.dao")
public class ModmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModmanagerApplication.class, args);
    }
}
