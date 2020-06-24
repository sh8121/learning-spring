package com.sboo.jpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
@Import(SbooRegistrar.class)
public class JpaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaTutorialApplication.class, args);
    }

}
