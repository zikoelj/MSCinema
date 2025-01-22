package com.eljabiry.movieservice.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Director{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int directorId;
    private String directorName;

    @OneToMany(mappedBy = "director")
    private List<Movie> movieList;
}