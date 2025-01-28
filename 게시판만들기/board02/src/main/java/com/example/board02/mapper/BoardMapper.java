package com.example.board02.mapper;

import com.example.board02.domain.Board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository  // 추가
public interface BoardMapper {

    //게시글 목록 조회
    List<Board> selectBoardList();

    //게시글 상세 조회
    Board selectBoardById(Long id);

    // 게시글 저장
    void insertBoard(Board board);

    // 게시글 수정
    void updateBoard(Board board);

    //게시글 삭제
    void deleteBoard(Long id);

    // 조회수 증가
    void updateViewCount(Long id);

}
