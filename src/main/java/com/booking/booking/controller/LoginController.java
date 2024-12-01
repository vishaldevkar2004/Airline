package com.booking.booking.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.booking.booking.entities.Login;
import com.booking.booking.services.LoginService;



@Controller
public class LoginController {
	private LoginService loginService;
	public LoginController(LoginService loginService) {
		this.loginService=loginService;
	}

	

	    @GetMapping("/login")
	    public String login() {
	        return "login";  // This should map to 'src/main/resources/templates/login.html'
	    }
	

	@PostMapping("/login-status")
	 public String getLoginStatus(@ModelAttribute Login login) {
		 loginService.saveUser(login);
		 return "home";
	 }
	 
	
	
}
