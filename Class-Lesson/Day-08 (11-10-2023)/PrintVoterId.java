package com.day08;

public class PrintVoterId {

	public static void main(String[] args) {
		int ages[] = {56,25,14,27,45,93,99,84,67,0,-24,55};
		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i] + " is a valid age");
			} catch(TooYoungAgeException e) {
			} catch(TooOldAgeException e) {
			} catch(NegativeAgeException e) {
			} catch(ZeroAgeException e) {
			} catch(Exception e) {
			}
		}
	}

	public static void checkAge(int age) throws TooYoungAgeException,
												TooOldAgeException,
												NegativeAgeException, 
												ZeroAgeException {
		if(age<0) throw new NegativeAgeException(age + " is less than zero");
		else 
	}
}
