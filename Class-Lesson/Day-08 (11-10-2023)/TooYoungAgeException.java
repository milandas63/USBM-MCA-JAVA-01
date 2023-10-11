package com.day08;

public class TooYoungAgeException extends AgeCeilingException {
	public TooYoungAgeException() {
		super();
	}
	public TooYoungAgeException(String message) {
		super(message);
	}

}
