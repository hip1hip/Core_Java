package com.example.board05.service;

import com.example.board05.dto.request.BoardRequest;
import com.example.board05.dto.response.BoardResponse;
import com.example.board05.entity.Board;
import com.example.board05.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BoardService {

    private final BoardRepository repository;

    public BoardResponse convertToDto(Board board){
        return BoardResponse.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .content(board.getContent())
                .build();
    }

    //생성
    public BoardResponse createBoard(BoardRequest request){
        //Request를 Entitiy 로
        Board board = Board.builder()
                .content(request.getContent())
                .writer(request.getWriter())
                .build();

        Board savedBoard = repository.save(board);

        return convertToDto(savedBoard);
    }

    //전체 조회
    public List<BoardResponse> getAllBoard(){
        return repository.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();
    }


    // 조회
    public BoardResponse getBoard(Long id) {
        Board findBoard = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("id 찾을 수 없음 "));

        return convertToDto(findBoard);
    }

    //수정
    public BoardResponse updateBoard(Long id, BoardRequest request){
        Board findBoard = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("id 찾을 수 없음 "));

        findBoard.setWriter(request.getWriter());
        findBoard.setContent(request.getContent());
        Board updateBoard = repository.save(findBoard);

        return convertToDto(updateBoard);
    }

    //삭제
    public void deleteBoard(Long id){
        repository.deleteById(id);
    }

}
