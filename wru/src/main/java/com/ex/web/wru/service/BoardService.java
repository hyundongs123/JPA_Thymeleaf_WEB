package com.ex.web.wru.service;

import com.ex.web.wru.entity.Board;
import com.ex.web.wru.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository ;

    //글 작성 처리
    public void write(Board board){

        boardRepository.save(board);

    }
    //게시글리스트 처리
    public List<Board> boardList(){

      return  boardRepository.findAll();
    }
    //특정게시글 불러오기

    public Board boardView(int id){
        return boardRepository.findById(id).get();
    }

}
