package com.eljabiry.movieservice.entities;

import lombok.*;

import jakarta.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor_image")
public class ActorImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;
    private String imageUrl;

    @OneToOne
    private Actor actor;
}