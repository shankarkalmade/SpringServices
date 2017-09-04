package com.shankar.spring.actuator.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greet")
	public String greet() {
		return "Hello World";
	}
	
	
}
