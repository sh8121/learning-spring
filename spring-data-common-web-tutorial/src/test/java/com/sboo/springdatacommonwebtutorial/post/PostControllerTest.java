package com.sboo.springdatacommonwebtutorial.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

@DataJpaTest
class PostControllerTest {

    @Autowired
    PostRepository postRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void save() {
        Post post = new Post();
        post.setTitle("jpa");
        Post savedPost = postRepository.save(post); // insert, persist

        System.out.println("post: " + post);
        System.out.println("savedPost: " + savedPost);
        assertTrue(entityManager.contains(post));
        assertTrue(entityManager.contains(savedPost));
        assertEquals(savedPost, post);


        Post postUpdate = new Post();
        postUpdate.setId(post.getId());
        postUpdate.setTitle("hibernate");
        Post updatedPost = postRepository.save(postUpdate); // update, merge
        assertTrue(entityManager.contains(updatedPost));
        assertFalse(entityManager.contains(postUpdate));
        assertNotEquals(updatedPost, postUpdate);

        //postUpdate.setTitle("Sang Hoon"); // 상태 변화 감지 x
        updatedPost.setTitle("Sang Hoon");

        List<Post> all = postRepository.findAll();
        assertEquals(all.size(), 1);
    }
}