package com.sample.jinsungdaily.member.controller;

import com.sample.jinsungdaily.member.dto.UserLogin;
import com.sample.jinsungdaily.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class LoginController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserLogin user) {
        memberService.LonginUser(user);
        return ResponseEntity.ok("회원가입 완료");
    }
}
