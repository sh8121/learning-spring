package com.sboo.springjpatutorial.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

//public class PostListener implements ApplicationListener<PostPublishedEvent> {
//    @Override
//    public void onApplicationEvent(PostPublishedEvent postPublishedEvent) {
//        System.out.println("========================");
//        System.out.println(postPublishedEvent.getPost().getTitle() + " is published");
//        System.out.println("========================");
//    }
//}

public class PostListener {
    @EventListener
    public void onEvent(PostPublishedEvent event) {
        System.out.println("=========================");
        System.out.println(event.getPost().getTitle() + " is published");
        System.out.println("=========================");
    }
}