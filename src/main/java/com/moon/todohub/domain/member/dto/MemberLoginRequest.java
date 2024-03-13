package com.moon.todohub.domain.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record MemberLoginRequest (
        @Email String email,
        @NotBlank String username,
        @NotBlank String password,
        String phoneNumber,
        String description
) {
}
