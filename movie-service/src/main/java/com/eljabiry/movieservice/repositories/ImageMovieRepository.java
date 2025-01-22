package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.ImageMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMovieRepository extends JpaRepository<ImageMovie,Integer> {
}
