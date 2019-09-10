package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Demo2Application {

	@RequestMapping ("/hello")
	public @ResponseBody String index() {
		return "Hello";
	}
	public static void main(String[] args) {
		
		SpringApplication.run(Demo2Application.class, args);
	}


}
