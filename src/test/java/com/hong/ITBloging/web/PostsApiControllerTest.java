package com.hong.ITBloging.web;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.web.IndexController;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostsApiControllerTest {

    @Autowired
    private PostsRepository postsRepository;

    @Test
    @DisplayName("메인화면 포스트 반환 테스트")
    public void main_post_return() throws Exception{

        List<Posts> postsList = postsRepository.findTop100ByOrderByRegDateDesc();
        for(Posts posts:postsList){
            System.out.println("id : " + posts.getId() + " content : " + posts.getContent() + " like : " + posts.getLike()
            + " regDate : " + posts.getRegDate() + " title : " + posts.getTitle());
        }

    }

    @Test
    @DisplayName("포스트 저장 테스트")
    public void posts_save() throws Exception {


        String title = "title";
        String content = "content";
        String regDate = "2023-05-21";
        int like = 17;

        PostsSaveRequestDto postsSaveRequestDto = PostsSaveRequestDto.builder()
                .title(title)
                .content(content)
                .regDate(regDate)
                .like(like)
                .build();

        //when
        Long save = postsRepository.save(postsSaveRequestDto.toEntity()).getId();

        //then
        assertEquals("title",postsRepository.findById(save).get().getTitle());

    }


}
