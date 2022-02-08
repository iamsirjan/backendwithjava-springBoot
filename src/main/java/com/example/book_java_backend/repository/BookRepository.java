package com.example.book_java_backend.repository;

import com.example.book_java_backend.modal.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
