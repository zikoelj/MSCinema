package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Long> {
    List<Actor> getActorsByMovieMovieId(int movieId);
}
