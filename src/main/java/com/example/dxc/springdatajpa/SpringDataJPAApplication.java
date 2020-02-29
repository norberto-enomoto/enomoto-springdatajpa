package com.example.dxc.springdatajpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
// Norberto Enomoto
public class SpringDataJPAApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJPAApplication.class, args);
    log.info("The application is using {} mb", (Runtime.getRuntime().totalMemory() / 1024 / 1024));
  }

}