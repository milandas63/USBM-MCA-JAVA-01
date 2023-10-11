package com.day08;

public class NegativeAgeException extends InvalidAgeException {
	public NegativeAgeException() {
		super();
	}
	public NegativeAgeException(String message) {
		super(message);
	}

}
