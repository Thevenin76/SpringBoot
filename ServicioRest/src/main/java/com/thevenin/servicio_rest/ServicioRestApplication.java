package com.thevenin.servicio_rest;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/v1")

@SpringBootApplication
public class ServicioRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioRestApplication.class, args);
	}

	@GetMapping(value = "/actual")
	public String getDate(){
		return "Tenerife: "+LocalDateTime.now();
	}

}
