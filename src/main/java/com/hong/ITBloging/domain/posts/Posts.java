package com.hong.ITBloging.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="postsid")
    private Long id;

    @Column(name="poststitle", nullable = false)
    private String title;

    @Column(name="postsregdate",nullable = false)
    private String regDate;

    @Column(name="postslike",nullable = false)
    private int like;

    @Column(name="postscontent",nullable = false,length = 2000)
    private String content;

    @Builder
    public Posts(String title, String regDate, int like, String content){

        this.title = title;
        this.regDate = regDate;
        this.like = like;
        this.content = content;
    }


}
