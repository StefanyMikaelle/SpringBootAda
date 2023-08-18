package com.api.SpringBootADA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAdaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAdaApplication.class, args);
	}

//	CommandLineRunner initDatabase(UserRepository userRepository){
//		return  args -> {
//			userRepository.deleteAll();
//
//			User u = new User();
//			u.setName("Stefany");
//			u.setEmail("stefany@hotmail.com");
//			u.setPassword("123");
//			userRepository.save(u);
//		};
//	}

}
