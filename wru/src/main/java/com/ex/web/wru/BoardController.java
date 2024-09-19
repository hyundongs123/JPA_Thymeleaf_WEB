package com.ex.web.wru;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @GetMapping("/board/write")
    public String boardWriteForm(){

        return"boardwrite";
    }
    @PostMapping("/board/writepro")
    public String boardWritePro(String title , String content){
        System.out.println(title);
        System.out.println(content);

        return "";
    }

}
