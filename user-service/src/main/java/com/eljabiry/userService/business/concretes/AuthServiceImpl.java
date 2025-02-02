package com.eljabiry.userService.business.concretes;

import com.eljabiry.userService.business.abstracts.AuthService;
import com.eljabiry.userService.business.abstracts.UserService;
import com.eljabiry.userService.core.security.JwtProviderService;
import com.eljabiry.userService.entity.User;
import com.eljabiry.userService.entity.dto.UserAuthenticationResponseDto;
import com.eljabiry.userService.entity.dto.UserLoginRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtProviderService jwtProvider;
    private final UserService userService;

    @Override
    public UserAuthenticationResponseDto login(UserLoginRequestDto userLoginRequestDto) {
        Authentication authenticate = authenticationManager.authenticate
                (new UsernamePasswordAuthenticationToken(
                userLoginRequestDto.getEmail(),
                userLoginRequestDto.getPassword()
        ));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        String token = jwtProvider.generateToken(authenticate);
        User user = userService.getUserByEmail(userLoginRequestDto.getEmail());
        return UserAuthenticationResponseDto.builder()
                .userId(user.getUserId())
                .fullName(user.getFullName())
                .email(userLoginRequestDto.getEmail())
                .token(token)
                .roles(authenticate.getAuthorities().stream()
                        .map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .build();
    }

}
