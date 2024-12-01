package com.booking.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.booking.booking.entities.Booking;
import com.booking.booking.services.BookingService;

@Controller
public class BookingController {

	 @Autowired
	    private BookingService bookingService;

	    @GetMapping("/booking")
	    public String showBookingForm(Model model) {
	       model.addAttribute("booking", new Booking());
	        return "bookingForm";
	    }

	    @PostMapping("/booking")
	    public String submitBooking(@ModelAttribute Booking booking, Model model) {
	        bookingService.saveBooking(booking);
	        model.addAttribute("booking", booking);
	        return "success";
	    }
	
	
}
