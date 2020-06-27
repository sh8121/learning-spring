package com.sboo.springjpatutorial.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {
        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post);

        postRepository.findMyPost();

        postRepository.delete(post);
        //Entity의 상태는 Removed 이지만
        //Default Rollback 이라 PersistenceContext에서 delete query를 날리지 않음.
        postRepository.flush();
        //Flush로 강제
    }
}