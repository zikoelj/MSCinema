package com.eljabiry.userService.business.abstracts;

import com.eljabiry.userService.entity.dto.UserAuthenticationResponseDto;
import com.eljabiry.userService.entity.dto.UserLoginRequestDto;

public interface AuthService {

    UserAuthenticationResponseDto login(UserLoginRequestDto userLoginRequestDto);

}
