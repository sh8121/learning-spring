package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired(required = false)
    BookRepository bookRepository;

//    @Autowired(required = false)
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
