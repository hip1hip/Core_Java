package com.example.board04.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // JSON 데이터 매핑을 위해 필요
@NoArgsConstructor
public class BoardRequestDto {
    private String title;
    private String content;
    private String writer;
}
