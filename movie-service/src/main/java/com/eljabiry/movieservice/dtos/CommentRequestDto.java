package com.eljabiry.movieservice.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentRequestDto {
    private String userId;
    private String commentText;
    private String commentBy;
    private String commentByUserId;
    private int movieId;
}