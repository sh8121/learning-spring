package com.sboo.jpatutorial;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

//    @Query(value = "SELECT c FROM Comment AS c ", nativeQuery = true)
    @Query("SELECT c FROM Comment AS c ")
    List<Comment> findByTitleContains(String  keyword);
}
