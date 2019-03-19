package com.example.loggingdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class LoggingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingDemoApplication.class, args);
	}



	@GetMapping("/")
	public String sayHello() {
		log.debug("ALESSIA AND SIMON ARE DEBUGGING");
		log.info("ALESSIA AND SIMON ARE INFOING");
		log.warn("ALESSIA AND SIMON ARE WARNING");
		log.error("ALESSIA AND SIMON ARE ERRORING");

		try {
			throw new RuntimeException("This is really really bad stuff");
		} catch (Throwable throwable) {
			log.error("ALESSIA AND SIMON - BAD Stuff has happened", throwable);
		}
		return "Hello world";
	}
}
