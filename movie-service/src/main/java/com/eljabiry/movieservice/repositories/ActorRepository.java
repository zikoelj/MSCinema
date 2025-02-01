package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ActorRepository extends JpaRepository<Actor,Long> {
    List<Actor> getActorsByMovieMovieId(int movieId);
}
