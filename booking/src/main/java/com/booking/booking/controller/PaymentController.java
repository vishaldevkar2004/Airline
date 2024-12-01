package com.booking.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.booking.booking.entities.Payment;
import com.booking.booking.services.PaymentService;

@Controller
public class PaymentController {
	 private PaymentService paymentService;

	    public PaymentController(PaymentService paymentService) {
	        this.paymentService = paymentService;
	    }

	    @GetMapping("/payment")
	    public String getPaymentForm(Model model) {
	        model.addAttribute("payments", new Payment());
	        return "payment";
	    }
}
