package com.example.sml.dynamicdatabase3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.sml.dynamicdatabase3.mapper")
public class Dynamicdatabase3Application {

    public static void main(String[] args) {
        SpringApplication.run(Dynamicdatabase3Application.class, args);
    }

}
