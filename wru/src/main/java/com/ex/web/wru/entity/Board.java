package com.ex.web.wru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Board {
    // Entity 란  DB의 테이블을 의미한다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String title;

    private String content;

}
