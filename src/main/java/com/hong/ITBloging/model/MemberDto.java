package com.hong.ITBloging.model;

import lombok.*;

@Getter
@Builder
@RequiredArgsConstructor
public class MemberDto {

    private final String birth;
    private final String email;
    private final String password;
    private final String name;
    private final String nickname;
    private final String sex;


}
