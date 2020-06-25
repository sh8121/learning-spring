package com.sboo.jpatutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {
    List<Comment> findByTitleContains(String  keyword);

    Page<Comment> findByLikeGreaterThanAndPost(int likeCount, Post post);
}
