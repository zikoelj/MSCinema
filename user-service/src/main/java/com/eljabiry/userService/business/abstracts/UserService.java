package com.eljabiry.userService.business.abstracts;

import com.eljabiry.userService.entity.User;
import com.eljabiry.userService.entity.dto.UserRegisterRequestDto;

public interface UserService {

    Boolean isUserExist(Long userId);

    void addUser(UserRegisterRequestDto userRegisterRequestDto);

    User getUserByEmail(String email);

    boolean isUserCustomer();

    boolean isUserAdmin();
}
