package com.example.board04.controller;

import com.example.board04.dto.CommentRequestDto;
import com.example.board04.dto.CommentResponseDto;
import com.example.board04.entity.Comment;
import com.example.board04.service.CommentService;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/boards/{boardId}/comments")
public class CommentController {
    private final CommentService commentService;

    //댓글 생성 
    @PostMapping
    public CommentResponseDto createComment(@PathVariable Long boardId, @RequestBody CommentRequestDto requestDto) {
        return commentService.createComment(boardId, requestDto);
    }

    //댓글 조회
    @GetMapping
    public List<CommentResponseDto> getComment(@PathVariable Long boardId){
        return commentService.getComment(boardId);
    }

    //댓글 삭제
    @DeleteMapping("/{commentId}")
    public void deleteComment(Long commentId){
        commentService.deleteComment(commentId);
    }
    
}
