package com.example.practicle;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticleApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PracticleApplication.class, args);
		openHomePage();
	}
	
	public static void openHomePage() throws IOException {
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8080/DRC/sign-up");
	}
}
