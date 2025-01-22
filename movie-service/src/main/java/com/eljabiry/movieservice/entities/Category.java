package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column(nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Movie> movies;
}
