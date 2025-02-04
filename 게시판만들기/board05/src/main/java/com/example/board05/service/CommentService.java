package com.example.board05.service;


import com.example.board05.dto.request.CommentRequest;
import com.example.board05.dto.response.CommentResponse;
import com.example.board05.entity.Board;
import com.example.board05.entity.Comment;
import com.example.board05.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {

    final CommentRepository repository;


    public CommentResponse convertToDto(Comment comment){
        return CommentResponse.builder()
                .id(comment.getId())
                .writer(comment.getWriter())
                .content(comment.getContent())
                .board(comment.getBoard())
                .build();
    }

    //댓글 생성
    public CommentResponse createComment(Board board_id, CommentRequest request){
        Comment board = repository.findById(board_id).orElseThrow(() -> new IllegalArgumentException("보드를 못찾았습니다."))

        Comment comment = Comment.builder()
                .content(request.getContent())
                .writer(request.getWriter())
                .build();
        Comment saved =repository.save(comment);

        return convertToDto(saved);


    }

}
