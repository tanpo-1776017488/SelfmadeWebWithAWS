package com.dawa.admin.web.domain.posts;
import com.dawa.admin.domain.posts.PostRepository;
import com.dawa.admin.domain.posts.Posts;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest  {
    @Autowired
    PostRepository PostsRepository;

    @After
    public void cleanup(){
        PostsRepository.deleteAll();

    }

    @Test
    public void 게시글저장_불러오기(){
        String title="테스트 게시글";
        String content="테스트본문";

        PostsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("jaehyeon@gmail.com")
                .build());

        List<Posts>postList=PostsRepository.findAll();

        Posts posts=postList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
