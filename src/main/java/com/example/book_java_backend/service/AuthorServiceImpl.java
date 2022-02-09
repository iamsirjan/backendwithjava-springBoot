package com.example.book_java_backend.service;


import com.example.book_java_backend.modal.Author;
import com.example.book_java_backend.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public  Author saveAuthor(Author author) {
        return  authorRepository.save(author);

    }

    @Override
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }

    @Override
    public void deleteAuthor(Long authorId) {
        authorRepository.deleteById(authorId);
    }

    @Override
    public void updateAuthor(Long authorId, Author author) {
        Author authorFromDb = authorRepository.findById(authorId).get();
        System.out.println(authorFromDb.toString());
        authorFromDb.setAddress(author.getAddress());
        authorFromDb.setAge(author.getAge());
        authorFromDb.setName(author.getName());

        authorRepository.save(authorFromDb);
    }


}
