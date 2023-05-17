package com.hong.ITBloging.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long id;

    @Column(name = "usernickname", nullable = false)
    private String nickname;

    @Column(name = "username", nullable = false)
    private String name;

    @Column(name = "usersex", nullable = false)
    private String sex;

    @Column(name = "useremail", nullable = false)
    private String email;

    @Column(name = "userbirth", nullable = false)
    private String birth;


}
