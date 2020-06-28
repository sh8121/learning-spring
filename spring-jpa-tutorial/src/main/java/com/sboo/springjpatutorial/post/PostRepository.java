package com.sboo.springjpatutorial.post;

import com.sboo.springjpatutorial.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends MyRepository<Post, Long>, QuerydslPredicateExecutor<Post> {
}
