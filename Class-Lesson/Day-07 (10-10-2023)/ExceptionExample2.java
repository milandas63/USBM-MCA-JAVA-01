package com.day07;

public class ExceptionExample2 {

	public static void main(String[] args) {
		int n = 34;
		int j = 0;
		String name = "USBM";
		int index = 7;
		char vowels[] = {'A','E','I','O','U','a','e','i','o','u'};
		int coordinate = 10;
		for(int i=0; i<3; i++) {
			try {
				System.out.println(n/j);
				System.out.println(name.charAt(index));
				System.out.println(vowels[coordinate]);
				System.out.println("There is no more exception");
				//throw new MyException();
			} catch(ArithmeticException e) {
				System.err.println(e);
				j = 2;
				i--;
			} catch(StringIndexOutOfBoundsException e) {
				System.err.println(e);
				index = 3;
				i--;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(e);
				coordinate = 3;
				i--;
			} catch(IndexOutOfBoundsException e) {
				System.err.println(e);
			} catch(ClassCastException e) {
				System.err.println(e);
			} catch(MyException e) {
				
			}
		}
	}

}


class MyException extends RuntimeException {
	
}