package com.sboo.springboottutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@TestPropertySource(properties = "sboo.name=Sang Hoon3")
@SpringBootTest(properties = "sboo.name=Sang Hoon2")
class SpringbootTutorialApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("sboo.name")).isEqualTo("Sang Hoon3");
    }

}
