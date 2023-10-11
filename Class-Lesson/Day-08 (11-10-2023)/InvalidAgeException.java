package com.day08;

public class InvalidAgeException extends AgeException {
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String message) {
		super(message);
	}

}
