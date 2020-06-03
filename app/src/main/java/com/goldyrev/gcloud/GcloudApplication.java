package com.goldyrev.gcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaAuditing
public class GcloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(GcloudApplication.class, args);
    }

}
