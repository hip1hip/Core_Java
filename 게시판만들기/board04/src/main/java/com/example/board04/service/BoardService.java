package com.example.board04.service;

import com.example.board04.dto.BoardRequestDto;
import com.example.board04.dto.BoardResponseDto;
import com.example.board04.entity.Board;
import com.example.board04.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    final BoardRepository repository;

    //글생성
    public BoardResponseDto crateBoard(BoardRequestDto requestDto){
        // RequestDto -> Entity 로 변환
        Board board = new Board();
        board.setTitle(requestDto.getTitle());
        board.setContent(requestDto.getContent());
        board.setWriter(requestDto.getWriter());

        //DB 저장
        Board saved = repository.save(board);

        // Entity -> ResponseDto 로 변환
        return BoardResponseDto.builder()
                .id(saved.getId())
                .title(saved.getTitle())
                .writer(saved.getWriter())
                .content(saved.getContent())
                .createdAt(saved.getCreatedAt())
                .viewCount(saved.getViewCount())
                .likeCount(saved.getLikeCount())
                .build();
    }

    // 조회
    public List<BoardResponseDto> getAllBoard(){
        //DB에서 모든 게시글 가져옴
        List<Board> boards = repository.findAll();
        //엔티티를 DTO 로 변환하여 반환
        return boards.stream()
                .map(board -> BoardResponseDto.builder()
                        .id(board.getId())
                        .title(board.getTitle())
                        .writer(board.getWriter())
                        .content(board.getContent())
                        .createdAt(board.getCreatedAt())
                        .viewCount(board.getViewCount())
                        .likeCount(board.getLikeCount())
                        .build())
                .toList();

    }

    // id 조회
    public BoardResponseDto getBoard(Long id){
        Board board = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
        //조회수 증가 메서드 사용 / 저장
        board.increaseViewCount();
        repository.save(board);
        //엔티티를 DTO 로 변환하여 반환
        return BoardResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .writer(board.getWriter())
                .content(board.getContent())
                .createdAt(board.getCreatedAt())
                .viewCount(board.getViewCount())
                .likeCount(board.getLikeCount())
                .build();
    }

    // 수정
    public BoardResponseDto updateBoard(Long id, BoardRequestDto requestDto){
        Board board = repository.findById(id).orElseThrow();
        // RequestDto -> Entity 로 변환
        board.setTitle(requestDto.getTitle());
        board.setWriter(requestDto.getWriter());
        board.setContent(requestDto.getContent());
        // DB에 저장
        Board updateBoard = repository.save(board);
        // Entity -> ResponseDto 변환
        return BoardResponseDto.builder()
                .id(updateBoard.getId())
                .title(updateBoard.getTitle())
                .writer(updateBoard.getWriter())
                .content(updateBoard.getContent())
                .createdAt(updateBoard.getCreatedAt())
                .viewCount(updateBoard.getViewCount())
                .likeCount(updateBoard.getLikeCount())
                .build();

    }

    //삭제
    public void deleteBoard(Long id){
        repository.deleteById(id);
    }


}
