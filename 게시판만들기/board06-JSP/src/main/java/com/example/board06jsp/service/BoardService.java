package com.example.board06jsp.service;

import com.example.board06jsp.domain.BoardDTO;
import com.example.board06jsp.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService{

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardDTO> getAllBoards(){
        return boardMapper.selectAll();
    }

    public void saveBoard(BoardDTO board) {
        // 필요한 비즈니스 로직 처리 (예: 데이터 검증)
        boardMapper.insertBoard(board);
    }

}