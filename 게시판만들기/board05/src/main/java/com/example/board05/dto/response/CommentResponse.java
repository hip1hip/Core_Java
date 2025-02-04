package com.example.board05.dto.response;


import com.example.board05.entity.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommentResponse {

    private Long id;
    private String writer;
    private String content;
    private Board board;
}
