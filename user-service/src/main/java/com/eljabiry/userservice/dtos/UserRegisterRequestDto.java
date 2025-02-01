package com.eljabiry.userservice.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterRequestDto {
    private String customerName;
    private String email;
    private String phone;
    private String password;
}