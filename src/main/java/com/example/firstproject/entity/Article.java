package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor //Class 모든 필드 값을 파라미터로 받는 생성자를 추가
@NoArgsConstructor //Class 기본 생성자를 자동으로 추가해줍니다.
@ToString // class 모든 필드에 toString method 생성
@Entity // db가 해당 객체 인식( table 생성 )
@Getter // class모든 필드에 Getter method 생성
public class Article {

    @Id//구분위한 대표값 지정
    // 1,2,3,... 자동생성 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy = db가 id를 자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


    public void patch(Article article) {
        if (article.title != null){
            this.title = article.title;
        }
        if (article.content != null){
            this.content = article.content;
        }
    }
}
