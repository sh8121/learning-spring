package com.sboo.springjpatutorial.post;

import com.sboo.springjpatutorial.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
