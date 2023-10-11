package com.day08;

public class AgeException extends Exception {
	public AgeException() {
		super();		//	calls the matching constructor of the immediate parent class
	}
	public AgeException(String message) {
		super(message);
	}

}
