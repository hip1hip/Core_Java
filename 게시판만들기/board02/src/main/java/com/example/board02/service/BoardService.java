package com.example.board02.service;

import com.example.board02.domain.Board;

import java.util.List;

public interface BoardService {
    //게시글 목록 조회
    List<Board> getBoardList();

    //게시글 상세 조회
    Board getBoard(Long id);

    //게시글 저장
    void saveBoard(Board board);

    // 게시글 수정
    void updateBoard(Board board);

    //게시글 삭제
    void deleteBoard(Long id);

}
