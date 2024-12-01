package com.booking.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.booking.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String>{

}
