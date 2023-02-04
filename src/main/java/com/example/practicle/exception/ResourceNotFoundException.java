package com.example.practicle.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String msg) {
		System.out.println(msg);
	}
}
