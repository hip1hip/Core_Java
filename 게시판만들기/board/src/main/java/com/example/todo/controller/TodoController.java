package com.example.todo.controller;


import com.example.todo.dto.TodoRequestDto;
import com.example.todo.dto.TodoResponseDto;
import com.example.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public List<TodoResponseDto> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public TodoResponseDto addTodo(@RequestBody TodoRequestDto requestDto) {
        return todoService.addTodo(requestDto);
    }

    @PutMapping("/{id}")
    public TodoResponseDto updateTodo(@PathVariable Long id, @RequestBody TodoRequestDto requestDto) {
        return todoService.updateTodo(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}