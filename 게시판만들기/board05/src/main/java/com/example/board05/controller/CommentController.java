package com.example.board05.controller;

import com.example.board05.dto.request.CommentRequest;
import com.example.board05.dto.response.CommentResponse;
import com.example.board05.entity.Board;
import com.example.board05.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("board/{board_id}/comment")
public class CommentController {

    final CommentService service;


    @PostMapping
    public CommentResponse cresteComment (@PathVariable Board board_id, @RequestBody CommentRequest request){
        return service.createComment(board_id ,request);
    }

}
