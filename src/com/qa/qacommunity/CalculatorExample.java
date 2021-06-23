package com.qa.qacommunity;

public class CalculatorExample {
		
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		System.out.println("The addition of a and b is = " + add(a, b));
		System.out.println("The subtraction of a and b is = " + subtract(a, b));
		System.out.println("The multiplication of a and b is = " + multiply(a, b));
		
		divide(31.9, 3);
		divide(2, 4);
		
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static void divide(double c, double d) {
				
		if (d < c) {
			System.out.println("The division of d and c = " + (d / c));
		}
		else {
			System.out.println("Division cannot be performed.");
		}
		
	}
	
}
