package com.student.exceptions;

public class UserNotFoundException extends RuntimeException {
	
	String message;

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}
	

}
