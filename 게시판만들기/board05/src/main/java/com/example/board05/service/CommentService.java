package com.example.board05.service;


import com.example.board05.dto.request.CommentRequest;
import com.example.board05.dto.response.CommentResponse;
import com.example.board05.entity.Board;
import com.example.board05.entity.Comment;
import com.example.board05.repository.BoardRepository;
import com.example.board05.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    final CommentRepository repository;
    final BoardRepository boardRepository;


    public CommentResponse convertToDto(Comment comment){
        return CommentResponse.builder()
                .id(comment.getId())
                .writer(comment.getWriter())
                .content(comment.getContent())
                .board(comment.getBoard())
                .build();
    }

    //댓글 생성
    public CommentResponse createComment(Long board_id, CommentRequest request){
        Board board = boardRepository.findById(board_id).orElseThrow(() -> new IllegalArgumentException("보드를 못찾았습니다."));

        Comment comment = Comment.builder()
                .content(request.getContent())
                .writer(request.getWriter())
                .board(board)
                .build();
        Comment saved = repository.save(comment);

        return convertToDto(saved);
    }

    // 댓글 조회 All
    public List<CommentResponse> findAllComment(){
        return repository.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    // 댓글 수정
    public CommentResponse updateComment(Long id , CommentRequest request) {
        Comment findComment = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("id 를 못찾았음"));

        findComment.setContent(request.getContent());
        findComment.setWriter(request.getWriter());
        Comment saved = repository.save(findComment);

        return convertToDto(saved);
    }

    // 댓글 삭제
    public void deleteComment(Long id){
        repository.deleteById(id);
    }

}





