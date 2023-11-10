package com.pj.simple_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	 @GetMapping("/helloworld")
	    public Hello helloWorld() {
	        return new Hello();
	    }

}
