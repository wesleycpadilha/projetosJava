package com.crudapi.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

	//"main" Metodo principal que da Start no projeto, a utilização do SpringBoot inicia o container Web e faz o deploy do projeto.

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

}