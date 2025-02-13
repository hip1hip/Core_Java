package com.example.board06jsp.mapper;

import com.example.board06jsp.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardMapper{
    List<BoardDTO> selectAll();
    BoardDTO selectOne(Long id);
    void insertBoard(BoardDTO board);
}