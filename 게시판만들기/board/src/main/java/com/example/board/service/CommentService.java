package com.example.board.service;

import com.example.board.dto.CommentDto;
import com.example.board.entity.Comment;
import com.example.board.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

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


    //생성
    public Comment createComment(CommentDto commentDto){
        // 피드백
        // 파라미터로 id 만 들어오는게 말이 안돼요
        // 댓글을 생성하는데 댓글에 관한 데이터 (제목, 작성자, 내용 등등)이 다 필요하죠

        // comment 는 지금 새로 new Comment()로 만들어서 아무 데이터도 없는 빈 객체인데
        // comment.getCommentContent() 이거는 아무 내용도 없죠
        // comment.getCommentAuthor() 얘도 마찬가지고요
        // 없는 데이터를 읽어서 set하겠다? 말이 안돼요.
        Comment comment = new Comment();
        comment.setCommentContent(commentDto.getCommentContent());
        comment.setCommentAuthor(commentDto.getCommentAuthor());
        return commentRepository.save(comment);
    }

    //수정
    public Comment updateComment(Long id, CommentDto commentDto){
//
//        // 오히려 얘는 CommentDto를 받으셨네요
//        // CommentDto commentDto 이렇게 데이터를 포함시켜서 보내주시는게 맞죠
//        // 그런데 아쉽지만 commentDto는 안쓰시고 ㅎㅎ
//        // 역시나 comment에서 get을 이용해 데이터를 읽네요
//        // 빈 데이터 읽으면 역시나 아무것도 없잖아요
//        // ㅇㅋ? 네에
//
//        // 수고요!
//        // 그리고 한 가지 팁인데 최대한 단위별로 개발하시면서 테스트도 같이 하시는게 좋아요
//        // 메서드를 여러개 한번에 만드시는 것보다 하나씩 검증 하시는게 좋아요
//        // 즉, CRUD를 짠다고 하면 Create 를 먼저해서 DB까지 잘 들어가는지 확인하고
//        // 그 다음 되면 Read 해보고
//        // 지금은 검증도 안된 코드를 한번에 작성하려면 더 힘들어요 나중에. 다 고쳐야해요.
//        // 수고요!!
//
//        //감사합니다 하나씩 해보겠습니다!!  !
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
