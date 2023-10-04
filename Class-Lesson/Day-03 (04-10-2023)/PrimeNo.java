package com.day03;

/*
 *		Write a program to print all PRIME numbers between 
 * 		1000 and 3000?
 * 
 */
public class PrimeNo {

	public static void main(String[] args) {
		int start = 1000;
		int end = 3000;
		int count = 0;
		boolean yn;
		
		for(int i=start; i<=end; i++) {
			yn = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yn = false;
					break;
				}
			}
			
			if(yn) {
				System.out.print(i+" ");
				count++;
				if(count>=10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

}
