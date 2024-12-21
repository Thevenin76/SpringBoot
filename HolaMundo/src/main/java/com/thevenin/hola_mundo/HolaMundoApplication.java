package com.thevenin.hola_mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoApplication {

	public static void main(String[] args) {
		System.out.println("¡Hola, Mundo desde Spring Boot!");
		SpringApplication.run(HolaMundoApplication.class, args);
	}

}
