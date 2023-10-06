package com.day04;

public class DataTypes {
	String name = "James Gosling";
	int age = 64;
	boolean male = true;

	public DataTypes() {
		
	}

	public DataTypes(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public void DataTypes() {
		
	}
	
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer j = new Integer("345");
		//Integer k = new Integer();
		
		String a = "";
		//String b = new String(10);
		byte[] ascii = {65,66,67,68,69,70,71,72};
		String zz = new String(ascii);
		System.out.println(zz);
		
		A aa = new C();
		
		

	}

	
	
}

class A extends DataTypes {
	
}

class B extends A {

}

class C extends B {
	
}
