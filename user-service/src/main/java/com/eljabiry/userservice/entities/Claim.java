package com.eljabiry.userservice.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter  @Setter  @NoArgsConstructor
@AllArgsConstructor  @Builder
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String claimId;
    private String claimName;
}
