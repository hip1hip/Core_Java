package com.example.board04.service;

import com.example.board04.dto.BoardRequestDto;
import com.example.board04.dto.BoardResponseDto;
import com.example.board04.entity.Board;
import com.example.board04.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor  // `final` 필드만 포함한 생성자 자동 생성
public class BoardService {

    final BoardRepository repository;
    final CommentService commentService;

    //글생성
    public BoardResponseDto crateBoard(BoardRequestDto requestDto){
        Board board = Board.builder()
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
                .writer(requestDto.getWriter())
                .build();

        //DB 저장
        Board saved = repository.save(board);

        // Entity -> ResponseDto 로 변환
        return covertToDto(saved);
    }

    // 조회
    public List<BoardResponseDto> getAllBoard(){
        //DB에서 모든 게시글 가져옴
        return repository.findAll().stream()
                .map(this::covertToDto)
                .toList();
    }

    // id 조회
    public BoardResponseDto getBoard(Long id){
        Board board = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다." + id));
        //조회수 증가 메서드 사용 / 저장
        board.increaseViewCount();
        repository.save(board);
        //엔티티를 DTO 로 변환하여 반환
        return covertToDto(board);
    }

    // 수정
    public BoardResponseDto updateBoard(Long id, BoardRequestDto requestDto){
        Board board = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다. id=" + id));
        // RequestDto -> Entity 로 변환
        board.setTitle(requestDto.getTitle());
        board.setWriter(requestDto.getWriter());
        board.setContent(requestDto.getContent());
        // DB에 저장
        Board updateBoard = repository.save(board);
        // Entity -> ResponseDto 변환
        return covertToDto(updateBoard);
    }

    //삭제
    public void deleteBoard(Long id){
        repository.deleteById(id);
    }

    // 공통 DTO 변환 메서드 (서비스 내부에 'private'으로 추가)
    private BoardResponseDto covertToDto(Board board){
        return BoardResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .writer(board.getWriter())
                .content(board.getContent())
                .createdAt(board.getCreatedAt())
                .updatedAt(board.getUpdatedAt())
                .viewCount(board.getViewCount())
                .likeCount(board.getLikeCount())
                .comments(commentService.getComment(board.getId()))
                .build();


    }


}
