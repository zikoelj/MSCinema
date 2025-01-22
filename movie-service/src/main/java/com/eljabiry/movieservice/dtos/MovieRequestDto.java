package com.eljabiry.movieservice.dtos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieRequestDto {
    private String movieName;
    private String description;
    private int duration;
    private LocalDate releaseDate;
    private String trailerUrl;
    private boolean isDisplay;
    private int categoryId;
    private int directorName;
    private List<Integer> actorsId;
    private List<Integer> citiesId;
}