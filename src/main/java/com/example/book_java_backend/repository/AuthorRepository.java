package com.example.book_java_backend.repository;

import com.example.book_java_backend.modal.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
