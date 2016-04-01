package com.devmedia.mvc;

import com.devmedia.mvc.controller.LivroController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = { "com.devmedia.mvc.entity" })
@EnableJpaRepositories(basePackages = { "com.devmedia.mvc.repository" })
@ComponentScan(basePackages = {"com.devmedia.mvc.controller"})

public class App {
    public static void main(String[] args) {
        SpringApplication.run(LivroController.class, args);
    }
}
