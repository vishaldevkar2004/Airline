package com.booking.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.booking.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

	

}
