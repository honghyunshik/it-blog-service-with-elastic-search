package com.hong.ITBloging.service.impl;

import com.hong.ITBloging.model.MemberDto;
import com.hong.ITBloging.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberDetailsServiceImpl implements UserDetailsService {

    private final MemberService memberService;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        MemberDto memberDto = MemberDto
                .builder()
                .email(email)
                .build();
        return null;
    }
}
