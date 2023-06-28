package com.hong.ITBloging.service;

import com.hong.ITBloging.model.MemberDto;

import java.util.Optional;

public interface MemberService {

    Optional<MemberDto> login(MemberDto memberDto);
}
