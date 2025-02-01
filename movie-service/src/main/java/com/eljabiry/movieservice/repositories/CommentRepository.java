package com.eljabiry.movieservice.repositories;

import com.eljabiry.movieservice.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> getCommentsByMovieMovieId(int movieId , Pageable pageable);
    int countCommentByMovieMovieId(int movieId);

}

