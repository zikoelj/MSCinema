package com.eljabiry.userservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter  @Setter  @NoArgsConstructor
@AllArgsConstructor  @Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(unique = true)
    private String email;
    private String password;
    private String fullName;
    @OneToMany
    private List<Claim> claims;
}
