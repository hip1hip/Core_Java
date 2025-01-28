package com.example.board02.service;

import com.example.board02.domain.Board;
import com.example.board02.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;
    
    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public List<Board> getBoardList() {
        return boardMapper.selectBoardList();
    }

    @Override
    public Board getBoard(Long id) {
        //조회수 증가 
        boardMapper.updateViewCount(id);
        //게시글 조회 
        return boardMapper.selectBoardById(id);
    }

    @Override
    @Transactional
    public void saveBoard(Board board) {
        boardMapper.insertBoard(board);
    }

    @Override
    @Transactional
    public void updateBoard(Board board){
        boardMapper.updateBoard(board);

    }

    @Override
    @Transactional
    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }

}