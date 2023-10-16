package com.day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public Class obj;
	
	public Reflection(String className) {
		StringBuffer buf = new StringBuffer();
		try {
			
			obj = Class.forName(className);
			Field[] f = obj.getDeclaredFields();
			Constructor[] c = obj.getDeclaredConstructors();
			Method[] m = obj.getDeclaredMethods();

			buf.append(className + "\r\n");
			for(int i=0; i<className.length(); i++) buf.append("-");
			buf.append("\r\n");
			
			// List of Fields
			if(f.length>0) {
				buf.append("FIELDS:\r\n");
				for(int i=0; i<f.length; i++) {
					buf.append((i+1) + ": " + remove(f[i].toString()) + "\r\n");
				}
			}

			// List of Constructors
			if(c.length>0) {
				buf.append("CONSTRUCTORS:\r\n");
				for(int i=0; i<c.length; i++) {
					buf.append((i+1) + ": " + remove(c[i].toString()) + "\r\n");
				}
			}

			// List of Mehtods
			if(m.length>0) {
				buf.append("METHODS:\r\n");
				for(int i=0; i<m.length; i++) {
					//buf.append((i+1) + ": " + m[i].toString() + "\r\n");
					buf.append((i+1) + ": " + remove(m[i].toString()) + "\r\n");
				}
			}

			buf.append("\r\n");
			System.out.println(buf);
		} catch(ClassNotFoundException e) {
			
		}
	}

	private String remove(String text) {
		StringBuffer buf = new StringBuffer();
		char c;
		boolean take = true;
		for(int i=text.length()-1; i>=0; i--) {
			c = text.charAt(i);
			switch(c) {
			case '.': take = false; break;
			case '(': take = true; break;
			case ')': take = true; break;
			case '[': take = true; break;
			case ']': take = true; break;
			case ' ': take = true; break;
			case ',': take = true; break;
			}
			
			if(take) buf.insert(0, c);
		}
		
		return buf.toString();
	}
	
	public static void main(String[] args) {
		new Reflection("java.lang.String");
	}

}
