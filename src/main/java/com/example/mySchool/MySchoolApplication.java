package com.example.mySchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySchoolApplication {
	public static void main(String[] args) {
		//localhost:8080 is the url
		SpringApplication.run(MySchoolApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {

		return String.format("Hello Kwstantina");
	}
	@GetMapping("/testGetRequest")
	public String testPage() {

		return String.format("Hello Gergios \n This is a test page for Kwstantina");
	}
}