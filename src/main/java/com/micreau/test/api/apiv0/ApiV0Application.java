package com.micreau.test.api.apiv0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiV0Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiV0Application.class, args);
    }

}

