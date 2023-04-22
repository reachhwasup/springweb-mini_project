package com.example.miniproject.service;

import com.example.miniproject.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticle();
    Article getArticleByID(int id);
    void addNewArticle(Article article);
}
