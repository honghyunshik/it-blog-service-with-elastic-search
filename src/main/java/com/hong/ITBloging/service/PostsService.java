package com.hong.ITBloging.service;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.model.PostsSaveRequestDto;

import java.util.List;

public interface PostsService {

    public Long save(PostsSaveRequestDto postsSaveRequestDto);
    public List<Posts> findAllDesc();
}
