package org.sparta.basicspringsession.service;

import lombok.RequiredArgsConstructor;
import org.sparta.basicspringsession.repostory.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
}
