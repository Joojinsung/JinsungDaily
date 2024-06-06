package com.sample.jinsungdaily.member.service;


import com.sample.jinsungdaily.member.dto.UserLogin;
import com.sample.jinsungdaily.member.entity.Member;
import com.sample.jinsungdaily.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void LonginUser(UserLogin user) {
        Member member = Member.builder()
                .email(user.email())
                .password(user.password())
                .build();

        memberRepository.save(member);
    }


}
