package com.eljabiry.movieservice.dtos;

import com.eljabiry.movieservice.entities.Actor;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieResponseDto {

    private int movieId;
    private String movieName;
    private String description;
    private int duration;
    private LocalDate releaseDate;
    private boolean isDisplay;
    private int categoryId;
    private String categoryName;
    private String imageUrl;
    private String movieTrailerUrl;
    private String directorName;
    //private List<Actor> actors;
}
