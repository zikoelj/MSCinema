package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.MovieSalleTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieSalleTimeRepository extends JpaRepository<MovieSalleTime,Integer> {
    List<MovieSalleTime> getMovieSalleTimeByMovie_MovieIdAndSalle_SalleId(int saloonId, int movieId);
}
