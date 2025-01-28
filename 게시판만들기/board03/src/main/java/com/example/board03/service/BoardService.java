package com.example.board03.service;

import com.example.board03.dto.BoardRequestDto;
import com.example.board03.dto.BoardResponseDto;
import com.example.board03.entity.Board;
import com.example.board03.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {

    private final BoardRepository repository;

    //전체 조회
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
                        .views(board.getViews())
                        .createdAt(board.getCreatedAt())
                        .build())
                .toList();
    }

    //조회
    public BoardResponseDto getBoard(Long id){
        Board board = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글이 존재하지 않습니다."));
        board.increaseViews();
        repository.save(board);
        return BoardResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .writer(board.getWriter())
                .content(board.getContent())
                .views(board.getViews())
                .createdAt(board.getCreatedAt())
                .build();

    }

    //작성
     public BoardResponseDto createdBoard(BoardRequestDto requestDto){
        // RequestDto -> Entity 로 변환
       Board board = new Board();
       board.setTitle(requestDto.getTitle());
       board.setWriter(requestDto.getWriter());
       board.setContent(requestDto.getContent());
       board.setViews(0);

       // DB에 저장
         Board savedBoard = repository.save(board);

         // Entity -> ResponseDto 변환 후 반환
       return BoardResponseDto.builder()
               .id(savedBoard.getId())
               .title(savedBoard.getTitle())
               .writer(savedBoard.getWriter())
               .content(savedBoard.getContent())
               .views(savedBoard.getViews())
               .createdAt(savedBoard.getCreatedAt())
               .build();
     }


    //수정


    //삭제

}
