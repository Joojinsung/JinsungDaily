package com.sample.jinsungdaily.member.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {
    GUEST("ROLE_GUEST"), USER("ROLE_USER");

    private final String key;
}
