package com.example.miniproject.repository;

import com.example.miniproject.model.Article;
import com.example.miniproject.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{

        add(new Article(101,"CR7 ", "Top player","https://www.aljazeera.com/wp-content/uploads/2022/12/SOR03134.jpg?resize=1920%2C1440",new AuthorRepository().getAllAuthor().get(0),new Category[]{new CategoryRepository().getCategories().get(0)}));

        add(new Article(102,"NeymarJr ", " Footballer in brazil ","https://phantom-marca.unidadeditorial.es/9988c8ddfff9dee6a1fdbae790d3a488/crop/8x0/2044x1358/resize/1320/f/jpg/assets/multimedia/imagenes/2023/03/15/16788994221188.png",new AuthorRepository().getAllAuthor().get(2),new Category[]{new CategoryRepository().getCategories().get(2)}));

        add(new Article(103,"Lional Messi", " Goat","https://phantom-marca.unidadeditorial.es/bd1fe4bec9580bfc6b7324d8c408165a/resize/1320/f/jpg/assets/multimedia/imagenes/2022/12/27/16721764313725.jpg",new AuthorRepository().getAllAuthor().get(1),new Category[]{new CategoryRepository().getCategories().get(1)}));

    }} ;


    public List<Article> getAllArticle(){
        return articleList;
    }

    public Article getArticleByID(int id ){
        return articleList.stream().filter(e-> e.getId()==id).findFirst()
                .orElse(null);
    }

    public void addNewArticle(Article article){
        articleList.add(article);
    }




}
