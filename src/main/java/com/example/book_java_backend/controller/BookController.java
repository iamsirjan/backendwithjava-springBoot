package com.example.book_java_backend.controller;

import com.example.book_java_backend.modal.Book;
import com.example.book_java_backend.modal.Payment;
import com.example.book_java_backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add/books")
    public  void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @GetMapping("/get/books")
    public List<Book> getAllBooks() {
        return  bookService.getAllBooks();
    }
}
