package com.booking.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.booking.booking.entities.Flight;
import com.booking.booking.entities.Users;
import com.booking.booking.services.FlightService;

@Controller
public class FlightController {

	private FlightService flightService;
	
	public FlightController(FlightService flightService) {
		this.flightService=flightService;
	}
	
    @GetMapping("/flights")
    public String getFlightsPage(Model model) {
        model.addAttribute("flights", new Flight());
        return "flights"; 
    }

    @PostMapping("/adding")
    public String addFlightSubmit(@ModelAttribute Flight flights) {
    	flightService.saveFlights(flights);
        return "adds"; 
    }
}
