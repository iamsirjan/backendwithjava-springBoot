package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);

    public List<Category> getAllCategories();
}
