package com.example.miniproject.repository;

import com.example.miniproject.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    List<Category> categoryList = new ArrayList<>(){{
        add(new Category(1,"Footballer"));
        add(new Category(2,"Super Star"));
        add(new Category(3,"Actor"));

    }};
    public List<Category> getCategories() {
        return categoryList;
    }
    public Category getCategoryById(int id){
        return categoryList.stream().filter((category -> category.getCatID()==id)).findFirst().orElse(
                null
        );
    }
}
