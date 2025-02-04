package com.example.board05.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardRequest {

    private String content;
    private String writer;

}
