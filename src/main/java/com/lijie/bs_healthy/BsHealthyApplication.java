package com.lijie.bs_healthy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages ={"com.lijie.bs_healthy"})
@SpringBootApplication

public class BsHealthyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsHealthyApplication.class, args);
    }

}
