package com.sboo.jpatutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContains(String keyword);

//    Error!
//    List<Comment> findByTitleContains(String  keyword);

    Page<Comment> findByLikeCountGreaterThanAndPostOrderByCreatedDesc(int likeCount, Post post, Pageable pageable);
//    List<Comment> findByLikeGreaterThanAndPostOrderByCreatedDesc(int likeCount, Post post, Sort sort);
//    List<Comment> findByLikeGreaterThanAndPost(int likeCount, Post post, Pageable pageable);
}
