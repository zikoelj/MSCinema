package com.eljabiry.movieservice.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageMovieRequestDto {
    private int movieId;
    private String imageUrl;
}
