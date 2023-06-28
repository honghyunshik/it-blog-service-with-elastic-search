package com.hong.ITBloging.model;

import com.hong.ITBloging.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class PostsSaveRequestDto {

    private final String title;
    private final String regDate;
    private final int like;
    private final String content;


    public Posts toEntity(){

        return Posts.builder()
                .title(title)
                .regDate(regDate)
                .like(like)
                .content(content)
                .build();
    }
}
