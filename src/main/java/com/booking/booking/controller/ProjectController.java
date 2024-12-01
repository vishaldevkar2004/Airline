package com.booking.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	
	@GetMapping("/about")
    public String getAbout() {

        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Corresponds to contact.html in templates
    }
    @GetMapping("/")
    public String home() {
        return "home"; // this should map to home.html in your resources/templates folder
    }
}
