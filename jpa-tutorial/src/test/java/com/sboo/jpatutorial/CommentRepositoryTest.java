package com.sboo.jpatutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() throws ExecutionException, InterruptedException {
        this.createComment("spring data jpa", 100);
        this.createComment("hibernate Spring", 55);
        this.createComment("SPRING boot", 45);
        commentRepository.flush();//바로 쿼리 날아감.

        List<Comment> all = commentRepository.findAll();
        assertThat(all.size()).isEqualTo(3);

        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "likeCount"));
        ListenableFuture<List<Comment>> future = commentRepository.findByCommentContainsIgnoreCase("Spring", pageRequest);
        System.out.println("===========================");
        System.out.println("is done?" + future.isDone());

        future.addCallback(new ListenableFutureCallback<List<Comment>>() {
            @Override
            public void onFailure(Throwable throwable) {
                System.out.println(throwable);
            }

            @Override
            public void onSuccess(@Nullable List<Comment> comments) {
                System.out.println("=====Async Result=====");
                System.out.println(comments.size());
            }
        });

        Thread.sleep(5000);
    }

    private void createComment(String commentStr, int likeCount) {
        Comment comment = new Comment();
        comment.setComment(commentStr);
        comment.setLikeCount(likeCount);
        commentRepository.save(comment);
    }
}