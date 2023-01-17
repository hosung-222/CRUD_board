package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        // case 1: 4번 게시글의 모든 댓글 조회
        {
            // 입력 데이터 준비
            Long articleId = 4L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(4L,"당신의 인생 영화는?","댓글 ㄱ");
            Comment a = new Comment(1L, article, "Park", "굳 월 헌팅");
            Comment b = new Comment(2L, article, "kim", "아이 엠 샘");
            Comment c = new Comment(3L, article, "Choi", "쇼생크의 탈출");
            List<Comment> expected = Arrays.asList(a,b,c);
            // 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글 출력 확인");
        }

        // case 2: 1번 게시글의 모든 댓글 조회


    }

    @Test
    void findByNickname() {
    }
}