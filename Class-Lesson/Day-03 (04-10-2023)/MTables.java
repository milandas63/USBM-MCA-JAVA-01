package com.day03;

//	Write a program to print all multiplication tables between 2 to 25?

public class MTables {

	public static void main(String[] args) {
		int start = 2;
		int end = 25;
		
		for(int i=start; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
	
		for(int h=start; h<=end; h+=6) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+5); j++) {
					System.out.print(padL(j,2) + " x " + padL(i,2) + " = " + padL((i*j),3) + "  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static String padL(int number, int length) {
		String rValue = ""+number;
		for(int i=rValue.length(); i<length; i++) {
			rValue = " "+rValue;
		}
		return rValue;
	}

}
