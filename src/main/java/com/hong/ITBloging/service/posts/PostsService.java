package com.hong.ITBloging.service.posts;

import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    //private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto postsSaveRequestDto){

        return null;
        //return postsRepository.save(postsSaveRequestDto.toEntity()).getId();
    }

}
