package com.example.helloworldspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloworldSpringbootApplication
{
    @GetMapping("/message")
	public String getMessage()
	{
		return "Hello Springboot World ....!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloworldSpringbootApplication.class, args);
	}

}
