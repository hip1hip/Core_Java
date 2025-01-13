package com.example.todo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TodoResponseDto  {
    private Long id;
    private String title;
    private boolean completed;
    private String createdAt;
}
