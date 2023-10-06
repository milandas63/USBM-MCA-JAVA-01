package com.day05;

public class StaticField {
	String father = "Jawaharlal Nehru";
	static String child = "Indira Gandhi";

	public StaticField() {
	}
	public StaticField(String x) {
		StaticField s1 = new StaticField();
		StaticField s2 = new StaticField();
		StaticField s3 = new StaticField();
		
		System.out.println("s1.Father="+s1.father+" / s1.child="+s1.child);
		System.out.println("s2.Father="+s2.father+" / s2.child="+s2.child);
		System.out.println("s3.Father="+s3.father+" / s3.child="+s3.child);
		
		s2.father = "Biju Patnaik";
		s2.child = "Naveen Patnaik";
		System.out.println();

		System.out.println("s1.Father="+s1.father+" / s1.child="+s1.child);
		System.out.println("s2.Father="+s2.father+" / s2.child="+s2.child);
		System.out.println("s3.Father="+s3.father+" / s3.child="+s3.child);
	}

	public static void main(String[] args) {
		new StaticField("");
	}

}
