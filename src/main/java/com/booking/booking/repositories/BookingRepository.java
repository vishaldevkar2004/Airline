package com.booking.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.booking.entities.Booking;


public interface BookingRepository extends JpaRepository<Booking,Long>{

}
