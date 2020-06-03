package com.example.fish.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
//@ComponentScan(basePackages = "com.example.fish")
@ComponentScan(basePackages = {"com.example.fish.controller","com.example.fish.service","com.example.fish.api","com.example.fish.config"})//扫描 @Controller、@Service 注解；
@EnableJpaRepositories(basePackages = "com.example.fish.repository")//扫描 @Repository 注解；
@EntityScan(basePackages = "com.example.fish.model")//扫描 @Entity 注解；
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class FishApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishApplication.class, args);
    }

}
