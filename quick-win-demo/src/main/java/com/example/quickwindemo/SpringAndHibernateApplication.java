package com.example.quickwindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;

/*SpellCheckingInspection*/
@SpringBootApplication
@ComponentScan(basePackages = "com.example.quickwindemo.A01")
@EntityScan(basePackages = "com.example.quickwindemo.A01")
public class SpringAndHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAndHibernateApplication.class, args);
    }
}
