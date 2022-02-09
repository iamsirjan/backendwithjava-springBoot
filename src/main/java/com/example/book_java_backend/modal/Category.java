package com.example.book_java_backend.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories",cascade=CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Category(Long id, String name, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public Category() {
    }
}
