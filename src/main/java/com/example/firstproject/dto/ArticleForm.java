package com.example.firstproject.dto;
//form 데이터를 받아올 그릇

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//lombok이용
@AllArgsConstructor //생성자 만들기
@ToString  // TOsting 만들기
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id,title,content);
    }
}
