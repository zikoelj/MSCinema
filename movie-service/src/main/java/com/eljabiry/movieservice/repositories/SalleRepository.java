package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalleRepository extends JpaRepository<Salle,Integer>{
}

