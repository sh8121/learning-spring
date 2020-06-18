package com.sboo.springframeworktutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
//    @Qualifier("sbooBookRepository")
    List<BookRepository> bookRepositories;

    public void printBookRepository() {
        //System.out.println(bookRepository.getClass());
        bookRepositories.forEach(bookRepository -> System.out.println(bookRepository.getClass()));
    }

//    @Autowired(required = false)
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}
