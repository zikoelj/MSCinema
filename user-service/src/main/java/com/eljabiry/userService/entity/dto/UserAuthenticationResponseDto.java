package com.eljabiry.userService.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuthenticationResponseDto {
    private Long userId;
    private String email;
    private String fullName;
    private List<String> roles;
    private String token;
}
