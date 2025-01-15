package com.example.board.controller;


import com.example.board.dto.CommentDto;
import com.example.board.entity.Comment;
import com.example.board.entity.Post;
import com.example.board.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/posts/{post_id}/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public Comment createComment(@RequestBody CommentDto commentDto, @PathVariable Long post_id){
        return commentService.createComment(commentDto,post_id);
    }

    @GetMapping
    public List<CommentDto> getAllComment() {
        return commentService.getAllComment();
    }

    @GetMapping("/{comment_id}")
    public Comment getCommentById(@PathVariable Long id){
        return commentService.getCommentById(id);
    }

    @PutMapping("/{comment_id}")
    public Comment updateComment(@PathVariable  Long id,@RequestBody CommentDto commentDto){
        return commentService.updateComment(id, commentDto);
    }

    @DeleteMapping("/{comment_id}")
    public void deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
    }


}
