package com.example.book_java_backend.service;


import com.example.book_java_backend.modal.Category;
import com.example.book_java_backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements  CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public void updateCategory(Long categoryId, Category category) {
            Category categoryFromDb = categoryRepository.findById(categoryId).get();
            categoryFromDb.setName(category.getName());
            categoryRepository.save(categoryFromDb);
    }
}
