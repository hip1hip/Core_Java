package com.example.todo.service;

import com.example.todo.dto.TodoRequestDto;
import com.example.todo.dto.TodoResponseDto;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public TodoResponseDto addTodo(TodoRequestDto requestDto) {
        Todo todo = new Todo();
        todo.setTitle(requestDto.getTitle());
        todo.setCompleted(requestDto.isCompleted());
        todo.setCreatedAt(LocalDateTime.now().toString());
        Todo savedTodo = todoRepository.save(todo);

        TodoResponseDto dto = new TodoResponseDto();
        dto.setId(savedTodo.getId());
        dto.setTitle(savedTodo.getTitle());
        dto.setCompleted(savedTodo.isCompleted());
        dto.setCreatedAt(savedTodo.getCreatedAt());
        return dto;
    }

    public TodoResponseDto updateTodo(Long id, TodoRequestDto requestDto){
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Todo not found"));
        todo.setTitle(requestDto.getTitle());
        todo.setCompleted(requestDto.isCompleted());
        Todo updatedTodo = todoRepository.save(todo);

        TodoResponseDto dto = new TodoResponseDto();
        dto.setId(updatedTodo.getId());
        dto.setTitle(updatedTodo.getTitle());
        dto.setCompleted(updatedTodo.isCompleted());
        dto.setCreatedAt(updatedTodo.getCreatedAt());
        return dto;
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
















