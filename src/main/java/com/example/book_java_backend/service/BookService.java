package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Book;
import com.example.book_java_backend.modal.Payment;

import java.util.List;

public interface BookService {
    public Book saveBook(Book book);

    public List<Book> getAllBooks();

    public void updateBook(Long bookId, Book book);

    public void deleteBook(Long bookId);
}
