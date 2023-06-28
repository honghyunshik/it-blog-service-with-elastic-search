package com.hong.ITBloging.service.impl;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.service.PostsService;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostsServiceImpl implements PostsService {

    private final PostsRepository postsRepository;

    //saveDto 저장
    @Override
    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto){

        return postsRepository.save(postsSaveRequestDto.toEntity()).getId();
    }

    //최근 100개의 포스트 반환
    @Override
    @Transactional
    public List<Posts> findAllDesc(){

        return postsRepository.findAllDesc();
    }

}
