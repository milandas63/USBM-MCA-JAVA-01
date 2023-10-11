package com.day08;

public class TooOldAgeException extends AgeCeilingException {
	public TooOldAgeException() {
		super();
	}
	public TooOldAgeException(String message) {
		super(message);
	}

}
