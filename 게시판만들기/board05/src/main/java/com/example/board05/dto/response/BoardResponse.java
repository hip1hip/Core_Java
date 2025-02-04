package com.example.board05.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardResponse {

    private Long id;
    private String writer;
    private String content;

}
