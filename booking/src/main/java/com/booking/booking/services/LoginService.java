package com.booking.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.booking.entities.Login;
import com.booking.booking.repositories.LoginRepository;



@Service
public class LoginService {
	private LoginRepository loginRepository;
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository=loginRepository;
	}
	
	public Login saveUser(Login login) {
		return(Login)
		loginRepository.save(login);
	}
	
	public List<Login>getAllUsers(){
		return loginRepository.findAll();
	}
	
	public boolean verifyLogin(String username,String password) {
		List<Login>all=loginRepository.findAll();
		return true;
	}
	
	
	
}
