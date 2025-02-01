package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> getCitiesByMovieMovieId(int movieId);

}
