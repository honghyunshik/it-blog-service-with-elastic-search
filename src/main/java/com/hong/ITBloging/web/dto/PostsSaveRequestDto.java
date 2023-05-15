package com.hong.ITBloging.web.dto;

import com.hong.ITBloging.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String regDate;
    private int like;
    private String content;

    @Builder
    public PostsSaveRequestDto(String title, String regDate, int like, String content){

        this.title = title;
        this.regDate = regDate;
        this.like = like;
        this.content = content;
    }


    public Posts toEntity(){

        return Posts.builder()
                .title(title)
                .regDate(regDate)
                .like(like)
                .content(content)
                .build();
    }
}
