package com.eljabiry.movieservice.services.abstractions;

import com.eljabiry.movieservice.dtos.CityRequestDto;
import com.eljabiry.movieservice.entities.City;

import java.util.List;

public interface CityService {
    List<City> getCitiesByMovieId(int movieId);
    List<City> getAll();
    void add(CityRequestDto cityRequestDto);
}
