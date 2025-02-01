package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.MovieSalleTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieSalleTimeRepository extends JpaRepository<MovieSalleTime,Integer> {
    List<MovieSalleTime> getMovieSalleTimeByMovie_MovieIdAndSalle_SalleId(int saloonId, int movieId);
}
