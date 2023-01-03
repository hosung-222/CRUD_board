package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor //default 생성자 추가
@ToString
@Entity // db가 해당 객체 인식( table 생성 )
@Getter
public class Article {

    @Id//구분위한 대표값 지정
    // 1,2,3,... 자동생성 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy = db가 id를 자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;



}
