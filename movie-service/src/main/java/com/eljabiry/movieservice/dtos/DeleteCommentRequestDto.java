package com.eljabiry.movieservice.dtos;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCommentRequestDto {
    private int commentId;
}