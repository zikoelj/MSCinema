package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,Integer> {
    Director getDirectorByDirectorId(int directorId);
}
