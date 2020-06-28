package com.sboo.springjpatutorial.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryTestConfig {
    @Bean
    public PostListener postListener() {
        return new PostListener();
    }

    @Bean
    public ApplicationListener<PostPublishedEvent> postListener2() {
        return postPublishedEvent -> {
            System.out.println("PostListener2");
            System.out.println(postPublishedEvent.getPost().getTitle());
        };
    }
}
