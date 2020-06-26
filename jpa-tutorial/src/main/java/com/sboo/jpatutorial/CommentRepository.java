package com.sboo.jpatutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {
    @Async
    Future<List<Comment>> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);
}
