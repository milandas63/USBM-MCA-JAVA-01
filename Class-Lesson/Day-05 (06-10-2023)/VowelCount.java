package com.day05;

import java.util.StringTokenizer;

public class VowelCount {

	public static void main(String[] args) {
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		String vowels = "AEIOUaeiou";
		int count = 0;
		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			for(int j=0; j<vowels.length(); j++) {
				if(c==vowels.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("Total vowels = "+count);
		
		text = "Quick,Brown,Fox,Jumps,Over,The,Lazy,Dog";
		text = "Quick;Brown;Fox;Jumps;Over;The;Lazy;Dog";
		String token;
		StringTokenizer stoken = new StringTokenizer(text,";");
		while(stoken.hasMoreElements()) {
			token = stoken.nextToken();
			System.out.println(token);
		}
	}

}
