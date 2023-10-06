package com.day05;

/*
 * 		Count which alphabet is used how many times?
 * 
 * 		We are students of USBM
 * 
 * 		A - 1
 *      B - 1
 *      D - 1
 *      E - 3
 */

public class CountAlpha {

	public static void main(String[] args) {
		char c;
		String text = "We are students of USBM";
		int[] occurances = new int[26];
		for(int i=0; i<occurances.length; i++) occurances[i] = 0;

		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			if(c>=65 && c<=90) {
				occurances[c-65]++;
			} else if(c>=97 && c<=122) {
				occurances[c-97]++;
			}
		}
		
		for(int i=0; i<occurances.length; i++) {
			if(occurances[i]>0) {
				System.out.println( (char)(i+65) + " = " + occurances[i]);
			}
		}
	}

}
