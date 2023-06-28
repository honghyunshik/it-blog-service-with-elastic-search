package com.hong.ITBloging.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberid")
    private Long id;

    @Column(name = "membernickname", nullable = false)
    private String nickname;

    @Column(name = "membername", nullable = false)
    private String name;

    @Column(name = "membersex", nullable = false)
    private String sex;

    @Column(name = "memberemail", nullable = false)
    private String email;

    @Column(name = "memberpassword", nullable = false)
    private String password;

    @Column(name = "memberbirth", nullable = false)
    private String birth;


}
