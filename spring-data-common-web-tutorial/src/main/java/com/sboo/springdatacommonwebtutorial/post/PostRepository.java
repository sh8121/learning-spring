package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitleStartsWith(String title);

    //Alias
    @Query(value = "SELECT p, p.title AS Title FROM Post AS p WHERE p.title = ?1")
    List<Post> findByTitle(String title, Sort sort);
}
