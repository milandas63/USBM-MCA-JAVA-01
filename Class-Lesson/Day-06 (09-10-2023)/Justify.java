package com.day06;

public class Justify {
	private static Stretch s;
	public static void main(String[] args) {
		s = new Stretch();
		System.out.println(s.padLeft("United School of Business Management", 60, '-'));
		System.out.println(s.padCenter("United School of Business Management", 60, '-'));
		System.out.println(s.padRight("United School of Business Management", 60, '-'));
		System.out.println();
		System.out.println(s.justifyLeft("United School of Business Management", 60, '-'));
		System.out.println(s.justifyCenter("United School of Business Management", 60, '-'));
		System.out.println(s.justifyRight("United School of Business Management", 60, '-'));
		System.out.println();
		System.out.println(s.stretch("United School of Business Management", 60, 'U', '-'));
		System.out.println(s.stretch("United School of Business Management", 60, 'C', '-'));
		System.out.println(s.stretch("United School of Business Management", 60, 'R', '-'));

	}

}
