package com.day08;

public class PrintVoterId {

	public static void main(String[] args) {
		int ages[] = {56,25,14,27,45,93,99,84,67,0,-24,55};
		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i] + " is a valid age");
			} catch(TooYoungAgeException e) {
				System.out.println(e.getMessage());
			} catch(TooOldAgeException e) {
				System.out.println(e.getMessage());
			} catch(NegativeAgeException e) {
				System.out.println(e.getMessage());
			} catch(ZeroAgeException e) {
				System.out.println(e.getMessage());
			} catch(Exception e) {
			}
		}
	}

	public static void checkAge(int age) throws TooYoungAgeException,
												TooOldAgeException,
												NegativeAgeException, 
												ZeroAgeException {
		if(age<0) throw new NegativeAgeException(age + " is less than zero");
		else if(age==0) throw new ZeroAgeException(age + " is zero");
		else if(age<18) throw new TooYoungAgeException(age + " is less than 18");
		else if(age>90) throw new TooOldAgeException(age + " is greater than 90");
	}
}
