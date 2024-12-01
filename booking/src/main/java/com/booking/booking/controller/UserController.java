package com.booking.booking.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.booking.booking.entities.Users;
import com.booking.booking.services.UserServices;

@Controller
public class UserController {

private UserServices userServices;
	
	public UserController(UserServices userServices) {
		this.userServices=userServices;
	}
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		model.addAttribute("user",new Users());
		return "register";
	}
	@PostMapping("/set")
	public String setUser(@ModelAttribute Users users) {
		userServices.saveUser(users);
		return "redirect:/list";
		
	}
	@GetMapping("/list")
	public String allUsers(Model model) {
		model.addAttribute("users",userServices.getAllUsers());
		return "status";
	}
}
