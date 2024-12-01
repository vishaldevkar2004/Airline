package com.booking.booking.entities;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;

@Entity
public class Booking {
@Id

	private Long id;
	private String fullName;
	private String email;
    private String contactNumber;
    private String destination;
    private String date;
    private String flightNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", fullName=" + fullName + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", destination=" + destination + ", date=" + date + ", flightNumber=" + flightNumber + "]";
	}
	public Booking(Long id, String fullName, String email, String contactNumber, String destination, String date,
			String flightNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.destination = destination;
		this.date = date;
		this.flightNumber = flightNumber;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
