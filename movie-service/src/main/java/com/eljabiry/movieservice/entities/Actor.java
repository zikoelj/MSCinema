package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    private Movie movie;
    @OneToOne(mappedBy = "actor")
    @JoinColumn(name = "actor_image_id")
    private ActorImage actorImage;
}