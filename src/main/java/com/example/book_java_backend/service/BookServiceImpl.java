package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Book;
import com.example.book_java_backend.modal.Payment;
import com.example.book_java_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {

        return  bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return  (List<Book>) bookRepository.findAll();
    }

    @Override
    public void updateBook(Long bookId, Book book) {
     Book bookFromDb = bookRepository.findById(bookId).get();
     bookFromDb.setName(book.getName());
     bookFromDb.setDescription(book.getDescription());
     bookFromDb.setPrice(book.getPrice());
     bookFromDb.setDiscount(book.getDiscount());
     bookFromDb.setDiscountPercent(book.getDiscountPercent());
     bookFromDb.setRating(book.getRating());
     bookFromDb.setSold(book.getSold());
     bookFromDb.setStock(book.getStock());
     bookFromDb.setAuthors(book.getAuthors());
     bookFromDb.setCategories(book.getCategories());
     bookRepository.save(bookFromDb);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
