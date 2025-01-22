package com.eljabiry.movieservice.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder @AllArgsConstructor @NoArgsConstructor @Setter @Getter
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "movie_id")
        private int movieId;
        @Column(nullable = false)
        private String movieName;
        private String description;
        private int duration;
        private double rating;
        private String movieTrailerUrl;
        @Column(nullable = false)
        private LocalDate releaseDate;
        private boolean isDisplay;
        @Column(nullable = false)
        private String directorName;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;

        @OneToOne(mappedBy = "movie")
        private ImageMovie imagemovie;

        @OneToMany(mappedBy = "movie")
        private List<Actor> actors;

        @ManyToOne
        @JoinColumn(name = "director_id")
        private Director director;

        @OneToMany(mappedBy = "movie")
        private List<Comment> comments;

        @OneToMany(mappedBy = "movie")
        private List<City> cities;
    }
