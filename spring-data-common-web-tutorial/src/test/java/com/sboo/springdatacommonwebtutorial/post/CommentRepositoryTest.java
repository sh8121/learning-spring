package com.sboo.springdatacommonwebtutorial.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Test
    public void getComment() {
        Post post = new Post();
        post.setTitle("jpa");
        Post savedPost = postRepository.save(post);

        Comment comment = new Comment();
        comment.setComment("spring data jpa");
        comment.setPost(savedPost);
        comment.setUp(10);
        comment.setDown(1);
        commentRepository.save(comment);

//        commentRepository.findByPost_Id(savedPost.getId(), CommentSummary.class)
//                .forEach(c -> {
//                    System.out.println("================");
//                    System.out.println(c.getVotes());
//                });
        commentRepository.findByPost_Id(savedPost.getId(), CommentOnly.class)
                .forEach(c -> {
                    System.out.println("===================");
                    System.out.println(c.getComment());
                });
    }
}