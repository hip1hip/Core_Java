package com.example.board06jsp.controller;

import com.example.board06jsp.domain.BoardDTO;
import com.example.board06jsp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/list")
    public String list(Model model) {
        List<BoardDTO> boards = boardService.getAllBoards();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    // 게시글 작성 페이지 - GET
    @GetMapping("/board/write")
    public String writeForm(){
        return "board/write";
    }


    // 게시글 작성 요청처리 - POST
    @PostMapping("/board/write")
    public String write(BoardDTO board){
        //폼에서 전송된 데이터는 자동으로 BoardDTO 에 바인딩됨
        boardService.saveBoard(board);
        return "redirect:/board/list";
    }


    
}