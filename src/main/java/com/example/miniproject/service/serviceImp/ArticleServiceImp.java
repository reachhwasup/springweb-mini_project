package com.example.miniproject.service.serviceImp;

import com.example.miniproject.model.Article;
import com.example.miniproject.repository.ArticleRepository;
import com.example.miniproject.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImp implements ArticleService {
    ArticleRepository articleRepository;
    ArticleServiceImp(){articleRepository = new ArticleRepository();}

    @Override
    public List<Article> getAllArticle() {
        return articleRepository.getAllArticle();
    }

    @Override
    public Article getArticleByID(int id) {
        return articleRepository.getArticleByID(id);
    }

    @Override
    public void addNewArticle(Article article) {
        articleRepository.addNewArticle(article);

    }
}
