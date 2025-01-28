package com.example.board03.controller;

import com.example.board03.dto.BoardRequestDto;
import com.example.board03.dto.BoardResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.board03.service.BoardService;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    
    private final BoardService service;
    

    @GetMapping
    public List<BoardResponseDto> getAllBoard(){
        return service.getAllBoard();
    }

    @GetMapping("/{id}")
    public BoardResponseDto getBoard(@PathVariable Long id){
        return service.getBoard(id);
    }

    @PostMapping
    public BoardResponseDto createdBoard(@RequestBody BoardRequestDto requestDto){
        return service.createdBoard(requestDto);
    }
}
