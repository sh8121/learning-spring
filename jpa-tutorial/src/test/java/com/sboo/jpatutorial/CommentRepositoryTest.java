package com.sboo.jpatutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() {
        this.createComment("spring data jpa", 100);
        this.createComment("hibernate Spring", 55);
        this.createComment("SPRING boot", 45);



//        List<Comment> comments = commentRepository.findByCommentContains("Spring");
//        SQL 비교해보기!
//        List<Comment> comments = commentRepository.findByCommentContainsIgnoreCaseOrderByLikeCountDesc("Spring");
//        List<Comment> comments = commentRepository.findByCommentContainsIgnoreCaseOrderByLikeCountAsc("Spring");
//        assertThat(comments.size()).isEqualTo(3);
//        assertThat(comments).first().hasFieldOrPropertyWithValue("likeCount", 45);

//        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "likeCount"));
//        Page<Comment> page = commentRepository.findByCommentContainsIgnoreCase("Spring", pageRequest);
//        assertThat(page.getNumberOfElements()).isEqualTo(3);
//        assertThat(page).first().hasFieldOrPropertyWithValue("likeCount", 100);

        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "likeCount"));
        try(Stream<Comment> stream = commentRepository.findByCommentContainsIgnoreCase("Spring", pageRequest);) {
            Comment comment = stream.findFirst().get();
            assertThat(comment.getLikeCount()).isEqualTo(100);
        }
    }

    private void createComment(String commentStr, int likeCount) {
        Comment comment = new Comment();
        comment.setComment(commentStr);
        comment.setLikeCount(likeCount);
        commentRepository.save(comment);
    }
}