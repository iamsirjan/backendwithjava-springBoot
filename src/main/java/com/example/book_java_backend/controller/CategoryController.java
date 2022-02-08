package com.example.book_java_backend.controller;


import com.example.book_java_backend.modal.Category;
import com.example.book_java_backend.service.AuthorService;
import com.example.book_java_backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add/category")
    public  void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    }

    @GetMapping("/get/categories")
    public List<Category> getAllCategories() {
        return  categoryService.getAllCategories();
    }
}
