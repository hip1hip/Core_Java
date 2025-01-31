package com.example.board04.controller;

import com.example.board04.dto.BoardRequestDto;
import com.example.board04.dto.BoardResponseDto;
import com.example.board04.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    //글 생성
    @PostMapping
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto boardRequestDto){
        return boardService.crateBoard(boardRequestDto);
    }

    //조회
    @GetMapping
    public List<BoardResponseDto> getAllBoard(){
        return boardService.getAllBoard();
    }

    @GetMapping("/{id}")
    public BoardResponseDto getBoard(@PathVariable Long id) {
        return boardService.getBoard(id);
    }

    //수정
    @PutMapping("/{id}")
    public BoardResponseDto updateBoard(@PathVariable Long id , @RequestBody BoardRequestDto boardRequestDto){
        return boardService.updateBoard(id, boardRequestDto);
    }

    //삭제
    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id){
        boardService.deleteBoard(id);
    }



}
