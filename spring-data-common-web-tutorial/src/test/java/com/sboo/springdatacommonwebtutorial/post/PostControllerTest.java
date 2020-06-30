package com.sboo.springdatacommonwebtutorial.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
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
    public void findByTitleStartsWith() {
        Post post = new Post();
        post.setTitle("Spring Data JPA");
        postRepository.save(post);

        List<Post> posts = postRepository.findByTitleStartsWith("Spring");
        assertEquals(posts.size(), 1);
    }

    @Test
    public void findByTitle() {
        Post post = new Post();
        post.setTitle("Spring");
        postRepository.save(post);

//        List<Post> posts = postRepository.findByTitle("Spring", Sort.by("title"));
//        List<Post> posts = postRepository.findByTitle("Spring", Sort.by("LENGTH(title)"));
        List<Post> posts = postRepository.findByTitle("Spring", JpaSort.unsafe("LENGTH(title)"));
        assertEquals(posts.size(), 1);
    }
}