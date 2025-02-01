package com.eljabiry.userservice.dtos;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuthenticationResponseDto {
    private String userId;
    private String email;
    private String fullName;
    private List<String> roles;
    private String token;
}
