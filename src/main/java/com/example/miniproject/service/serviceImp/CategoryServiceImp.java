package com.example.miniproject.service.serviceImp;

import com.example.miniproject.model.Category;
import com.example.miniproject.repository.CategoryRepository;
import com.example.miniproject.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    CategoryRepository categoryRepository;

    CategoryServiceImp() {
        categoryRepository = new CategoryRepository();
    }



    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getCategories();
    }

    @Override
    public Category getCategoryByID(int id) {
        return categoryRepository.getCategoryById(id);
    }
}
