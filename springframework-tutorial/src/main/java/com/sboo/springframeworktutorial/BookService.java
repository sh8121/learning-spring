package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService implements InitializingBean {

    @Autowired
    BookRepository myBookRepository;

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
        System.out.println(myBookRepository.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
        System.out.println(myBookRepository.getClass());
    }
}
