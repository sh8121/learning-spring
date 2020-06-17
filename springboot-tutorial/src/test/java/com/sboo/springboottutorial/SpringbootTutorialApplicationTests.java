package com.sboo.springboottutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootTutorialApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("sboo.name")).isEqualTo("Good");
    }

}
