package com.hong.ITBloging.service.impl;


import com.hong.ITBloging.domain.member.MemberRepository;
import com.hong.ITBloging.model.MemberDto;
import com.hong.ITBloging.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Optional<MemberDto> login(MemberDto memberDto) {

        return memberRepository.findByEmail(memberDto.getEmail());
    }
}
