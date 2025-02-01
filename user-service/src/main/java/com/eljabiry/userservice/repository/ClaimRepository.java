package com.eljabiry.userservice.repository;

import com.eljabiry.userservice.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim,String> {
}
