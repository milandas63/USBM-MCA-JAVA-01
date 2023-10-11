package com.day08;

public class ZeroAgeException extends InvalidAgeException {
	public ZeroAgeException() {
		super();
	}
	public ZeroAgeException(String message) {
		super(message);
	}

}
