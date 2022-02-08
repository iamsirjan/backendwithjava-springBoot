package com.example.book_java_backend.controller;


import com.example.book_java_backend.modal.Payment;
import com.example.book_java_backend.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add/payment")
    public void savePayment(@RequestBody Payment payment) {
        paymentService.savePayment(payment);
    }

    @GetMapping("/get/payments")
    public List<Payment> getAllPayments() {
        return  paymentService.getAllPayments();
    }
}
