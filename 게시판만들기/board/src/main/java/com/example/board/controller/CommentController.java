package com.example.board.controller;


import com.example.board.dto.CommentDto;
import com.example.board.entity.Comment;
import com.example.board.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public Comment createComment(@RequestBody CommentDto commentDto){
        return commentService.createComment(commentDto);
    }

    @GetMapping
    public List<CommentDto> getAllComment() {
        return commentService.getAllComment();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id){
        return commentService.getCommentById(id);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable  Long id,@RequestBody CommentDto commentDto){
        return commentService.updateComment(id, commentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
    }


}
