package com.example.book_java_backend.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    private  int day;
    private Long total;
    private String type;
    private Boolean returned;
    private Long fine;
    private Long paid;



    @ManyToOne()
    @JoinColumn(name = "users_id")
    private User users;

    @OneToMany()
    @JoinColumn(name="book_id")
    private Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Payment(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public Long getFine() {
        return fine;
    }

    public void setFine(Long fine) {
        this.fine = fine;
    }

    public Long getPaid() {
        return paid;
    }

    public void setPaid(Long paid) {
        this.paid = paid;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Payment() {
    }

    public Payment(Long id, int day, Long total, String type, Boolean returned, Long fine, Long paid, User users) {
        this.id = id;
        this.day = day;
        this.total = total;
        this.type = type;
        this.returned = returned;
        this.fine = fine;
        this.paid = paid;
        this.users = users;
    }
}
