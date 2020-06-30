package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

//    @EntityGraph(value = "Comment.post", type = EntityGraph.EntityGraphType.LOAD)
    @EntityGraph(value = "Comment.post")
    Optional<Comment> getById(Long id);

}
