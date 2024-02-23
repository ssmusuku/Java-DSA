package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableWebSecurity
@ComponentScan(basePackages = "com.practice")
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
