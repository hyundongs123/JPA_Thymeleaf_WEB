package com.ex.web.wru.controller;


import com.ex.web.wru.entity.Board;
import com.ex.web.wru.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm(){

        return"boardWrite";
    }
    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){
        System.out.println(board.getId());
        System.out.println(board.getTitle());
        System.out.println(board.getContent());

        boardService.write(board);

        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){

        model.addAttribute("list",boardService.boardList());
    return "boardList";
    }
    @GetMapping("/board/view") //
    public String boardView(Model model,int id){
        model.addAttribute("board",boardService.boardView(id));

    return "boardView";  //대소문자를 알아서 구분해주는듯하다 x -> window 에선 구분  다른 OS 에선 맞춰 줘야 한다..
    }




}
