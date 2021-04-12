package com.br.registermessageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class RegisterMessageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterMessageServiceApplication.class, args);
	}

}
