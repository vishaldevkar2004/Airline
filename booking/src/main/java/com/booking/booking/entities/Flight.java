package com.booking.booking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Flight {

	   
	   @Id
	    private Long id;

	    private String flightNumber;
	    private String airline;
	    private String departure;
	    private String destination;
	    private String departureTime;
	    private String arrivalTime;

	    // Getters and Setters

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public void setFlightNumber(String flightNumber) {
	        this.flightNumber = flightNumber;
	    }

	    public String getAirline() {
	        return airline;
	    }

	    public void setAirline(String airline) {
	        this.airline = airline;
	    }

	    public String getDeparture() {
	        return departure;
	    }

	    public void setDeparture(String departure) {
	        this.departure = departure;
	    }

	    public String getDestination() {
	        return destination;
	    }

	    public void setDestination(String destination) {
	        this.destination = destination;
	    }

	    public String getDepartureTime() {
	        return departureTime;
	    }

	    public void setDepartureTime(String departureTime) {
	        this.departureTime = departureTime;
	    }

	    public String getArrivalTime() {
	        return arrivalTime;
	    }

	    public void setArrivalTime(String arrivalTime) {
	        this.arrivalTime = arrivalTime;
	    }

		public Flight(Long id, String flightNumber, String airline, String departure, String destination,
				String departureTime, String arrivalTime) {
			super();
			this.id = id;
			this.flightNumber = flightNumber;
			this.airline = airline;
			this.departure = departure;
			this.destination = destination;
			this.departureTime = departureTime;
			this.arrivalTime = arrivalTime;
		}

		public Flight() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", airline=" + airline + ", departure="
					+ departure + ", destination=" + destination + ", departureTime=" + departureTime + ", arrivalTime="
					+ arrivalTime + "]";
		}
	    
	    
	}


