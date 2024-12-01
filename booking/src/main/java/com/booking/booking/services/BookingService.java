package com.booking.booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.booking.entities.Booking;
import com.booking.booking.entities.Flight;
import com.booking.booking.repositories.BookingRepository;
import com.booking.booking.repositories.FlightRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
		this.bookingRepository=bookingRepository;
	}
    
    
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
	
    public List<Booking>getAllBookings(){
		return bookingRepository.findAll();
	}
	
}
