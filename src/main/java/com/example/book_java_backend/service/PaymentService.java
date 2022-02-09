package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Payment;

import java.util.List;

public interface PaymentService {

    public Payment savePayment(Payment payment);

    public List<Payment> getAllPayments();

    public void deletePayment(Long paymentId);

    public void updatePayment(Long paymentId, Payment payment);
}
