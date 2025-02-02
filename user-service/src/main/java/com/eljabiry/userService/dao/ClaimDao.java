package com.eljabiry.userService.dao;

import com.eljabiry.userService.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimDao extends JpaRepository<Claim, Long> {

    Claim getClaimByClaimName(String claimName);
}
