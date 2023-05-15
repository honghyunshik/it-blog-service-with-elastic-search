package com.hong.ITBloging.service.posts;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    //saveDto 저장
    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto){

        return postsRepository.save(postsSaveRequestDto.toEntity()).getId();
    }

    //최근 100개의 포스트 반환
    @Transactional
    public List<Posts> findAllDesc(){

        return postsRepository.findAllDesc();
    }

}
