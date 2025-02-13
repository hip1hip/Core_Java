package com.example.board06jsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.board06jsp.mapper")
@SpringBootApplication
public class Board06JspApplication {

    public static void main(String[] args) {
        SpringApplication.run(Board06JspApplication.class, args);
    }

}
