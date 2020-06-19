package com.sboo.springboottutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Autowired
    private String hello;

    @Autowired
    private SbooProperties sbooProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("==========================");
        logger.debug(hello);
        logger.debug(sbooProperties.getName());
        logger.debug(sbooProperties.getFullName());
        logger.debug("==========================");
    }
}
