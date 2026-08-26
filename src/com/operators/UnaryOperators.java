package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a; //declaration
		a = +5; //assignment - positive number (+5 or 5 (preferred) both are same)
		int b;
		b = -a; 
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int c;
		c = --a; //Pre-Decrement - Decrement first then use it
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		c = ++a; //Pre-Increment - Increment first then use it 
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		c = a--; //Post-Decrement - Use first then decrement it
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		c = a++; //Post-Increment - Use first then increment it
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		
		boolean isStatus = false;
		isStatus = !isStatus;
		System.out.println(isStatus);
	}
}
