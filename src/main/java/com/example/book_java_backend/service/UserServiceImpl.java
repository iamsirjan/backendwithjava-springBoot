package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.User;
import com.example.book_java_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void updateUser(Long userId, User user) {

        User userFromDb = userRepository.findById(userId).get();
        userFromDb.setName(user.getName());
        userFromDb.setEmail(user.getEmail());
        userFromDb.setPhone(user.getPhone());
        userFromDb.setAddress(user.getAddress());
        userFromDb.setUser(user.getUser());
        userFromDb.setAdmin(user.getAdmin());
        userRepository.save(userFromDb);
    }
}
