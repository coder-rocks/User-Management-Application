package com.webdev.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.webdev.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages= {"com.webdev.springboot"})
public class SpringBootCRUDApp {
 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}

}
