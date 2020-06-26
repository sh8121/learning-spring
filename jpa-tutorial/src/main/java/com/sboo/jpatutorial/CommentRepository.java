package com.sboo.jpatutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {
    List<Comment> findByCommentContains(String keyword);
    List<Comment> findByCommentContainsIgnoreCase(String keyword);
    List<Comment> findByCommentContainsIgnoreCaseAndLikeCountGreaterThan(String keyword, int likeCount);
    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountAsc(String keyword);
    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCountDesc(String keyword);
//    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
    Stream<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
}
