package com.sboo.springdatacommonwebtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "accountAuditAware")
public class SpringDataCommonWebTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataCommonWebTutorialApplication.class, args);
    }

}
