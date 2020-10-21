package com.example.helloworldspringboot;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * below are the annotations used to call appropriate packages, classes and its relevant methods
 */
@RestController
@SpringBootApplication
@Logger
public class HelloworldSpringbootApplication
{
	//private static final Logger LOGGER=LoggerFactory.getLogger(HelloworldSpringbootApplication.class);

	@GetMapping("/helloworld")
	public String getMessage()
	{
		return "Hello Springboot World ....!!!";
	}
	public static void main(String[] args)
	{
		SpringApplication.run(HelloworldSpringbootApplication.class, args);
		/*LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);*/
	}

}
