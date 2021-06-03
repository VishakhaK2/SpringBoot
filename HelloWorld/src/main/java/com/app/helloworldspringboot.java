package com.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class helloworldspringboot {
	public static void main(String args[])
	{
		SpringApplication.run(helloworldspringboot.class, args);
		//new SpringApplicationBuilder(helloworldspringboot.class).run(aArgs)
	}

}
