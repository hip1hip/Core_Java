package com.example.todo.service;

import com.example.todo.dto.TodoResponseDto;
import com.example.todo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<TodoResponseDto> getTodos() {
        return todoRepository.findAll().stream()
                .map(todo -> {
                    TodoResponseDto dto = new TodoResponseDto();
                    dto.setId(todo.getId());
                    dto.setTitle(todo.getTitle());
                    dto.setCompleted(todo.isCompleted());
                    dto.setCreatedAt(todo.getCreatedAt());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
