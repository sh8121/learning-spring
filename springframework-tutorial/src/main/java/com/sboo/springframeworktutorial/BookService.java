package com.sboo.springframeworktutorial;

import org.springframework.stereotype.Service;

public class BookService {
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Error
//    public void setBooksRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
