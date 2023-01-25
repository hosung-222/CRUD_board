//package com.example.firstproject;
//
//import com.example.firstproject.entity.Article;
//import com.example.firstproject.entity.Comment;
//import com.example.firstproject.repository.ArticleRepository;
//import com.example.firstproject.repository.CommentRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.transaction.Transactional;
//
//@Component
//@RequiredArgsConstructor
//public class InitDb {
//
//    private final InitService initService;
//
//    @PostConstruct
//    public void init() {
//        initService.dbInit1();
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService {
//
//        private final ArticleRepository articleRepository;
//        private final CommentRepository commentRepository;
//
//        public void dbInit1() {
//            System.out.println("Init1" + this.getClass());
//            Article article1 = new Article(1L, "가가가가", "1111");
//            articleRepository.save(article1);
//
//            Article article2 = new Article(2L, "나나나나", "2222");
//            articleRepository.save(article2);
//
//            Article article3 = new Article(3L, "다다다다", "3333");
//            articleRepository.save(article3);
//
//            Article article4 = new Article(4L, "당신의 인생 영화는?", "댓글 ㄱ");
//            articleRepository.save(article4);
//
//            Article article5 = new Article(5L, "당신의 소울 푸드는", "댓글 ㄱㄱ");
//            articleRepository.save(article5);
//
//            Article article6 = new Article(6L, "당신의 취미는 ", "댓글 ㄱㄱㄱ");
//            articleRepository.save(article6);
//
//            Comment comment1 = new Comment(1L, article4, "Park", "굳 월 헌팅");
//            commentRepository.save(comment1);
//
//            Comment comment2 = new Comment(2L, article4, "Kim", "아이 엠 샘");
//            commentRepository.save(comment2);
//
//            Comment comment3 = new Comment(3L, article4, "Choi", "쇼생크의 탈출");
//            commentRepository.save(comment3);
//
//
//            Comment comment4 = new Comment(4L, article5, "Park", "치킨");
//            commentRepository.save(comment4);
//
//            Comment comment5 = new Comment(5L, article5, "Kim", "샤브샤브");
//            commentRepository.save(comment5);
//
//            Comment comment6 = new Comment(6L, article5, "Choi", "초밥");
//            commentRepository.save(comment6);
//
//            Comment comment7 = new Comment(7L, article6, "Park", "조깅");
//            commentRepository.save(comment7);
//
//            Comment comment8 = new Comment(8L, article6, "Kim", "유튜브");
//            commentRepository.save(comment8);
//
//            Comment comment9 = new Comment(9L, article6, "Choi", "독서");
//            commentRepository.save(comment9);
//        }
//    }
//}