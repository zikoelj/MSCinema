package com.eljabiry.movieservice.services.abstractions;

import com.eljabiry.movieservice.dtos.CommentRequestDto;
import com.eljabiry.movieservice.dtos.DeleteCommentRequestDto;
import com.eljabiry.movieservice.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByMovieId(int movieId, int pageNo, int pageSize);
    void deleteComment(DeleteCommentRequestDto deleteCommentRequestDto);
    Comment addComment(CommentRequestDto commentRequestDto);
    int getNumberOfCommentsByMovieId(int movieId);
}
