package com.example.board06jsp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class BoardDTO{
    private Long id;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdDate;

}