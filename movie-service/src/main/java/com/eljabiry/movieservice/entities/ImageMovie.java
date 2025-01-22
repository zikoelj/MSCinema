package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ImageMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;
    @Column(nullable = false)
    private String imageUrl;
    private String movieTrailerUrl;

    @OneToOne
    private Movie movie;
}
