package org.sparta.basicspringsession.controller;

import lombok.RequiredArgsConstructor;
import org.sparta.basicspringsession.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
}
