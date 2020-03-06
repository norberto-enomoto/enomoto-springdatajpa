package com.example.dxc.springdatajpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Slf4j
// Norberto Enomoto
public class SpringDataJPAApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJPAApplication.class, args);
    log.info("The application is using {} mb", (Runtime.getRuntime().totalMemory() / 1024 / 1024));
  }

  @Bean
  public Docket productApi() {
     return new Docket(DocumentationType.SWAGGER_2).select().
     apis(RequestHandlerSelectors.
     basePackage("com.example.dxc.springdatajpa")).build();
  }

}