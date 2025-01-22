package com.eljabiry.movieservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComment;
    private String commentText;
    private String commentBy;
    private double rating;
    private String commentByUserId;
    private LocalDateTime reviewDate;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie; // reviewed movie
}
