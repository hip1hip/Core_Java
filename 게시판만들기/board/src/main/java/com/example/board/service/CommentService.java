package com.example.board.service;

import com.example.board.dto.CommentDto;
import com.example.board.entity.Comment;
import com.example.board.entity.Post;
import com.example.board.repository.CommentRepository;
import com.example.board.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    //전체 조회
    public List<CommentDto> getAllComment() {
        List<Comment> comments = commentRepository.findAll(); // Comment 조회
        List<CommentDto> commentDtos = new ArrayList<>(); //CommentDto 객체를 저장할 리스트 초기화

        for (Comment comment : comments){ // Comment 엔티티 반복
            CommentDto dto = new CommentDto(); // 새로운 CommentDto 객체 생성 
            dto.setCommentAuthor(comment.getCommentAuthor()); // 댓글 작성자 설정 
            dto.setCommentContent(comment.getCommentContent()); // 댓글 내용 설정 
            commentDtos.add(dto); //변환된 CommentDto를 리스트에 추가
        }
        return commentDtos;  // 변환된 CommentDto 리스트 반환 
    }

    //id 단일조회
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));
    }


    @Transactional
    //생성
    public Comment createComment(CommentDto commentDto, Long post_Id){
        Post post = postRepository.findById(post_Id)
                .orElseThrow(() -> new IllegalArgumentException("뭐시기저시기"));

        Comment comment = new Comment();
        comment.setCommentContent(commentDto.getCommentContent());
        comment.setCommentAuthor(commentDto.getCommentAuthor());
        comment.setPost(post);
        return commentRepository.save(comment);
    }

    //수정
    public Comment updateComment(Long id, CommentDto commentDto){
        Comment comment = getCommentById(id);
        comment.setCommentContent(commentDto.getCommentContent());
        comment.setCommentAuthor(commentDto.getCommentAuthor());
        return commentRepository.save(comment);
    }

    //삭제
    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }






}
