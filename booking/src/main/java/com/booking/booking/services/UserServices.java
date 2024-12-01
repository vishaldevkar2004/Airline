package com.booking.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.booking.entities.Users;
import com.booking.booking.repositories.UserRepository;

@Service
public class UserServices {

	private UserRepository userRepository;
	public UserServices(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public Users saveUser(Users users) {
		return (Users) userRepository.save(users);
		
	}
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
}
