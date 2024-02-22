package com.inho.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MyRestfulServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyRestfulServiceApplication.class, args);
    }

}
