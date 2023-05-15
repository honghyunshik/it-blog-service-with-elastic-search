package com.hong.ITBloging.web;

import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.service.posts.PostsService;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/crawling/save/v1/posts")
    public void save(@RequestBody List<PostsSaveRequestDto> postsSaveRequestDtoList){

        for(PostsSaveRequestDto postsSaveRequestDto:postsSaveRequestDtoList){
            postsService.save(postsSaveRequestDto);
        }
    }
}
