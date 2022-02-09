package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public List<User> getAllUsers();

    public void deleteUser(Long userId);

    public void updateUser(Long userId, User user);
}
