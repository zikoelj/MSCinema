package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    @Column(nullable=false)
    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<Salle> salles;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}