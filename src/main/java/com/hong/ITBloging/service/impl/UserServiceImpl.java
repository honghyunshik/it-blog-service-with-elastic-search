package com.hong.ITBloging.service.impl;


import com.hong.ITBloging.domain.user.MemberRepository;
import com.hong.ITBloging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final MemberRepository userRepository;


}
