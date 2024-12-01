package com.booking.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.booking.entities.Payment;
import com.booking.booking.repositories.PaymentRepository;

@Service
public class PaymentService {
	  private PaymentRepository paymentRepository;

	    public PaymentService(PaymentRepository paymentRepository) {
	        this.paymentRepository = paymentRepository;
	    }

	    public Payment saveUser(Payment payment) {
	        return (Payment) paymentRepository.save(payment);

	    }

	    public List<Payment> getAllUsers() {
	        return paymentRepository.findAll();
	    }
	
	
	
}
