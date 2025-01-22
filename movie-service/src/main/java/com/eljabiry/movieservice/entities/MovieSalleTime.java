package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //cest un classe associatif entre movie et salle
public class MovieSalleTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieBeginTime;

    @ManyToOne
    @JoinColumn(name = "saloon_id")
    private Salle salle;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
