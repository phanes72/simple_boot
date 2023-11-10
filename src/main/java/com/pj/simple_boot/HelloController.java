package com.pj.simple_boot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

	@GetMapping("/")
	public Hello index() {
		return new Hello("Greetings from Spring Boot!","Hope you enjoy your stay.");
	}
	
	 @GetMapping("/helloworld")
	    public Hello helloWorld() {
	        return new Hello();
	    }

}
