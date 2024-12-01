package com.booking.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.booking.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{

}
