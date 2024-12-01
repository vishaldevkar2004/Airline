package com.booking.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.booking.entities.Flight;
import com.booking.booking.entities.Login;
import com.booking.booking.entities.Users;
import com.booking.booking.repositories.FlightRepository;
import com.booking.booking.repositories.LoginRepository;

@Service
public class FlightService {

	private FlightRepository flightRepository;
	
	public FlightService(FlightRepository flightRepository) {
		this.flightRepository=flightRepository;
	}
	
	public Flight saveFlights(Flight flights) {
		return (Flight) flightRepository.save(flights);
		
	}
	
	public List<Flight>getAllflights(){
		return flightRepository.findAll();
	}
	

}
