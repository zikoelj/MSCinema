package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> getCitiesByMovieMovieId(int movieId);

}
