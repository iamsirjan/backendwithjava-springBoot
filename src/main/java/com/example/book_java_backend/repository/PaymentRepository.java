package com.example.book_java_backend.repository;

import com.example.book_java_backend.modal.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
