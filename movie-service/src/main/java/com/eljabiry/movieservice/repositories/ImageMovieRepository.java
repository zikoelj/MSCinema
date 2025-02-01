package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.ImageMovie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageMovieRepository extends JpaRepository<ImageMovie,Integer> {
}
