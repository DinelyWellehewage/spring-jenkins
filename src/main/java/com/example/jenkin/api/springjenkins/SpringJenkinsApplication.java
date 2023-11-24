package com.example.jenkin.api.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger =  LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void initt(){
		logger.info("application started ...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
