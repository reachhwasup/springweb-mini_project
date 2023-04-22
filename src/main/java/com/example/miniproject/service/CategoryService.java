package com.example.miniproject.service;

import com.example.miniproject.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryByID(int id);
}
