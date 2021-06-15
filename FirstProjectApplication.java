package com.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class FirstProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
		  @RequestMapping("/")
	
	        // 3. Method that maps to the request route above
	        public String hello() {
	                return "Hello Client, How are you doing?";
	            
	}
		  @RequestMapping("/random")
		  
		  public String boot() {
			  return  "Spring Boot is great! So easy to just respond with strings.";
		  }
		  }

