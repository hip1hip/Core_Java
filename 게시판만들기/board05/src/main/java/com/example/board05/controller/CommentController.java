package com.example.board05.controller;

import com.example.board05.dto.request.CommentRequest;
import com.example.board05.dto.response.CommentResponse;
import com.example.board05.entity.Board;
import com.example.board05.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("boards/{board_id}/comments")
public class CommentController {

    final CommentService service;

    @PostMapping
    public CommentResponse createComment (@PathVariable Long board_id, @RequestBody CommentRequest request){
        return service.createComment(board_id ,request);
    }

    @GetMapping
    public List<CommentResponse> findAllComment(){
        return service.findAllComment();
    }

    @PutMapping("{id}")
    public CommentResponse updateComment(@PathVariable Long id, @RequestBody CommentRequest request){
        return service.updateComment(id, request);
    }

    @DeleteMapping("{id}")
    public void deleteComment(@PathVariable Long id){
        service.deleteComment(id);
    }



}
