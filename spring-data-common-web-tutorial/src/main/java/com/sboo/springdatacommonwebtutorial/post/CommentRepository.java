package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment> {

//    @EntityGraph(value = "Comment.post", type = EntityGraph.EntityGraphType.LOAD)
    @EntityGraph(attributePaths = "post")
    Optional<Comment> getById(Long id);

    //Closed Projection
//    List<Comment> findByPost_Id(Long id);
    <T> List<T> findByPost_Id(Long id, Class<T> clazz);
}
