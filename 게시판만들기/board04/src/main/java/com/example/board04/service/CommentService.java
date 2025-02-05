package com.example.board04.service;

import com.example.board04.dto.CommentResponseDto;
import com.example.board04.entity.Board;
import com.example.board04.entity.Comment;
import com.example.board04.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.board04.dto.CommentRequestDto;
import com.example.board04.repository.CommentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
//@AllArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    // ResponseDTO 반복을 convertToDto 메서드로 만들어서 사용.
    public CommentResponseDto convertToDto(Comment comment){
        return CommentResponseDto.builder()
                .id(comment.getId())
                .content(comment.getContent())
                .writer(comment.getWriter())
                .createdAt(comment.getCreatedAt())
                .build();
    }

    //댓글 생성 
    public CommentResponseDto createComment(Long boardId, CommentRequestDto requestDto) {
        Board board = boardRepository.findById(boardId).orElseThrow(() ->
        new IllegalArgumentException("게시글이 존재하지 않습니다."));

        Comment comment = Comment.builder()
                .content(requestDto.getContent())
                .writer(requestDto.getWriter())
                .board(board)
                .build();

        Comment savedComment = commentRepository.save(comment);
        return  convertToDto(savedComment);

    }

    // 댓글 조회
    public List<CommentResponseDto> getComment(Long boardId){
        return commentRepository.findByBoardIdOrderByCreatedAtDesc(boardId)
                .stream()
                .map(this::convertToDto)
                .toList();
    }

    // 댓글 삭제 
    public void deleteComment(Long commentId){
        commentRepository.deleteById(commentId);
    }
    
    
}
