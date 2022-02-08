package com.example.book_java_backend.controller;


import com.example.book_java_backend.modal.Author;
import com.example.book_java_backend.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add/author")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @GetMapping("/get/authors")
    public List<Author> getAllAuthors() {
        return  authorService.getAllAuthors();
    }
}