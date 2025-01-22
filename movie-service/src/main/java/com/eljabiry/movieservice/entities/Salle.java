package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Salle {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int salleId;
        private String salleName;

        @ManyToOne
        @JoinColumn(name = "city_id")
        private City city;
}