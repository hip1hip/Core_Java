package com.example.board03.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BoardRequestDto {
    private String title;
    private String writer;
    private String content;
}



