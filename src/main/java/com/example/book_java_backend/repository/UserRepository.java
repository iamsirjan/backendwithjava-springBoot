package com.example.book_java_backend.repository;

import com.example.book_java_backend.modal.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
