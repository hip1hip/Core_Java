package com.example.board.dto;

import com.example.board.entity.Comment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String category;
    private Comment comment;

}
