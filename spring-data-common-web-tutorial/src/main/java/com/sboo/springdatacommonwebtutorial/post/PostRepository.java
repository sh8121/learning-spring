package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitleStartsWith(String title);

    @Query(value = "SELECT p FROM Post AS p WHERE p.title = ?1", nativeQuery = false)
    List<Post> findByTitle(String title);
}
