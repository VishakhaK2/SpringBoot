package com.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class helloworldspringboot {
	@GetMapping("/testhelloservice")
	public String hello()
	{
		return "Hello World...";
	}
	
	public static void main(String args[])
	{
		SpringApplication.run(helloworldspringboot.class, args);
		//new SpringApplicationBuilder(helloworldspringboot.class).run(aArgs)
	}

}
