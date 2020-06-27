package com.sboo.springjpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryImplementationPostfix = "Default")
public class SpringJpaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaTutorialApplication.class, args);
    }

}
