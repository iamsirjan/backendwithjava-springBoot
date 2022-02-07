package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Book;
import com.example.book_java_backend.modal.Payment;

import java.util.List;

public interface BookService {
    public Payment saveBook(Payment payment);

    public List<Payment> getAllBooks();
}
