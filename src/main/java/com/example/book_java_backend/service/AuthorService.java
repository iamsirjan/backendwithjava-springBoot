package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Author;

import java.util.List;

public interface AuthorService {
    public  Author saveAuthor(Author author);

    public List<Author> getAllAuthors();


    public void deleteAuthor(Long authorId);
}
