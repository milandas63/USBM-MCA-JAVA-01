package com.day07;

public class ExceptionExample1 {

	public static void main(String[] args) {
		try {
			int i = 25;
			int j = 0;
			System.out.println(i/j);
			System.out.println("Follow-1");
			System.out.println("Follow-2");
			System.out.println("Follow-3");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(ClassCastException e) {
			System.out.println("ClassCastException");
		}
	}

}
