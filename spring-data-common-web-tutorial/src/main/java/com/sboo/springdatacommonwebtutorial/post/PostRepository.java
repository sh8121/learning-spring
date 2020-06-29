package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitleStartsWith(String title);

    List<Post> findByTitle(String title);
}
