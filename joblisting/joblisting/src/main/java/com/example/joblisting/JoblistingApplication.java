package com.example.joblisting;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JoblistingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoblistingApplication.class, args);
    }

}
