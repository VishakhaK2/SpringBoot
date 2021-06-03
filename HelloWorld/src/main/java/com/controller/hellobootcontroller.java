package com.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellobootcontroller {
	@GetMapping("/testhelloservice")
	public String hello()
	{
		return "Hello World";
	}

}
