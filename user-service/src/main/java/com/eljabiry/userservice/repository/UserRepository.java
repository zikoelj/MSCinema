package com.eljabiry.userservice.repository;

import com.eljabiry.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
