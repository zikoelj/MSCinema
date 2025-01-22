package com.eljabiry.movieservice.services.abstractions;

import com.eljabiry.movieservice.dtos.ActorRequestDto;
import com.eljabiry.movieservice.entities.Actor;

import java.util.List;

public interface ActorService{
    List<Actor> getActorsByMovieId(int movieId);
    List<Actor> getAll();
    void addActors(ActorRequestDto actorRequestDto);
}
