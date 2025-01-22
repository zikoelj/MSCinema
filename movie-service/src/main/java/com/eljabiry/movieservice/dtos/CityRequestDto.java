package com.eljabiry.movieservice.dtos;

import lombok.*;
import java.util.List;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityRequestDto {
    private int movieId;
    private List<String> CityNameList;
}