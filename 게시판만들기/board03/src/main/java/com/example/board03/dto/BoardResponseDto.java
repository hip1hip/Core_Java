package com.example.board03.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class BoardResponseDto {
    private Long id;
    private String title;
    private String writer;
    private String content;
    private int views;
    private LocalDateTime createdAt;
}
