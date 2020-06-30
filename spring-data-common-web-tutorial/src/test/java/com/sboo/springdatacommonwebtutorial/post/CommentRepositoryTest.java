package com.sboo.springdatacommonwebtutorial.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void getComment() {
//        Post post = new Post();
//        post.setTitle("jpa");
//        Post savedPost = postRepository.save(post);
//
//        Comment comment = new Comment();
//        comment.setComment("comment");
//        comment.setPost(savedPost);
//        commentRepository.save(comment);

        commentRepository.findById(1l);
    }
}