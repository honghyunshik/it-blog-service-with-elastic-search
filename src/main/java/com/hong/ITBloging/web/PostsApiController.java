package com.hong.ITBloging.web;

import com.hong.ITBloging.service.impl.PostsServiceImpl;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsServiceImpl postsService;

    //크롤링한 데이터 리스트 db에 저장하기
    @ApiOperation(value = "크롤링한 포스트 DB 저장", notes = "크롤링한 PostSaveRequestDto List를 DB에 저장한다")
    @PostMapping("/crawling/save/v1/posts")
    public void save(@RequestBody List<PostsSaveRequestDto> postsSaveRequestDtoList){

        for(PostsSaveRequestDto postsSaveRequestDto:postsSaveRequestDtoList){
            postsService.save(postsSaveRequestDto);
        }
    }


}
