package com.example.book_java_backend.repository;

import com.example.book_java_backend.modal.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category,Long> {
}
