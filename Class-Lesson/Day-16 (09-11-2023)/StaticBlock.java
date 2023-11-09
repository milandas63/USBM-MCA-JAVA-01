package com.day16;

public class StaticBlock {
	static {
		System.out.println("Executed first...");
	}
	
	public static void main(String[] args) {
		System.out.println("Executed second...");
		new StaticBlock();
		new StaticBlock();
	}
}
