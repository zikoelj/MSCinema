package com.eljabiry.userService.dao;

import com.eljabiry.userService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findUserByUserId(Long userId);

    User findUserByEmail(String email);
}
