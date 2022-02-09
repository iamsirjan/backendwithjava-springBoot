package com.example.book_java_backend.service;

import com.example.book_java_backend.modal.Payment;
import com.example.book_java_backend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements  PaymentService {
    @Autowired
    private  PaymentRepository paymentRepository;
    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return (List<Payment>) paymentRepository.findAll();
    }

    @Override
    public void deletePayment(Long paymentId) {
            paymentRepository.deleteById((paymentId));
    }

    @Override
    public void updatePayment(Long paymentId, Payment payment) {
        Payment paymentFromDb = paymentRepository.findById(paymentId).get();
        paymentFromDb.setDay(payment.getDay());
        paymentFromDb.setTotal(payment.getTotal());
        paymentFromDb.setType(payment.getType());
        paymentFromDb.setReturned(payment.getReturned());
        paymentFromDb.setFine(payment.getFine());
        paymentFromDb.setPaid(payment.getPaid());
        paymentFromDb.setUsers(payment.getUsers());
        paymentFromDb.setBooks(payment.getBooks());
        paymentRepository.save(paymentFromDb);
    }
}
