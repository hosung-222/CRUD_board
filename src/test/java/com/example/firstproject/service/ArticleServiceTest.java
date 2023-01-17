package com.example.firstproject.service;

import com.example.firstproject.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 해당 classs는 springboot와 연동되어 테스트됨
class ArticleServiceTest {

    @Autowired ArticleService articleService;

    @Test
    void index() {
        // 에상
        Article  a = new Article(1L, "가가가가", "1111");
        Article  b = new Article(2L, "나나나나", "2222");
        Article  c = new Article(3L, "다다다다", "3333");
        List<Article> expected = new ArrayList<Article>(Arrays.asList(a,b,c));
        // 결과
        List<Article> articles =articleService.index();

        // 비교
        assertEquals(expected.toString(), articles.toString());
    }

    @Test
    void show_success(){ //존재하는 id 입력시
        // 예상
        Long id = 1L;
        Article expected = new Article(id, "가가가가", "1111");

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }
    @Test
    void show_fail(){ // 존재하지 않는 id 입력
        // 예상
        Long id = -1L;
        Article expected = null;

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    void  create_sccess(){}

}