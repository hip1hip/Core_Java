package com.example.board02.controller;

import com.example.board02.domain.Board;
import com.example.board02.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    //게시글 목록 페이지
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("boardList", boardService.getBoardList());
        return "board/list"; // /WEB-INF/views/board/list.jsp
    }
    

    //게시글 작성 페이지 
    @GetMapping("/write")
    public String writeForm(){
        return "board/write";
    }

    //게시글 작성 처리 
    @PostMapping("/write")
    public String write(Board board){
        boardService.saveBoard(board);
        return "redirect:/board/list";
    }

    //게시글 상세 페이지 
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id, Model model){
        model.addAttribute("board", boardService.getBoard(id));
        return "board/detail";
    }

    //게시글 수정 페이지
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("board", boardService.getBoard(id));
        return "board/edit";
    }

    //게시글 수정 처리 
    @PostMapping("/edit/{id}")
    public String edit(Board board){
        boardService.updateBoard(board);
        return "redirect:/board/detail/" + board.getId();
    }

    //게시글 삭제 
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        boardService.deleteBoard(id);
        return "redirect:/board/list";
    }
    
}
