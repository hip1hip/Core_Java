package com.example.board05.controller;

import com.example.board05.dto.request.BoardRequest;
import com.example.board05.dto.response.BoardResponse;
import com.example.board05.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService service;

    @PostMapping
    public BoardResponse createBoard(@RequestBody BoardRequest request) {
        return service.createBoard(request);
    }

    @GetMapping
    public List<BoardResponse> getAllBoard(){
        return  service.getAllBoard();
    }

    @GetMapping("{id}")
    public BoardResponse getBoard(@PathVariable Long id){
        return service.getBoard(id);
    }

    @PutMapping("{id}")
    public BoardResponse updateBoard(@PathVariable Long id, @RequestBody BoardRequest request){
        return service.updateBoard(id, request);
    }

    @DeleteMapping("{id}")
    public void deleteBoard(@PathVariable Long id){
        service.deleteBoard(id);
    }



}
