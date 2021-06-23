package com.qa.qacommunity;

public class CalculatorExample {
		
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		double c = 10.9d;
		double d = 11.2d;
		System.out.println("The addition of a and b is = " + add(a, b));
		System.out.println("The subtraction of a and b is = " + subtract(a, b));
		System.out.println("The multiplication of a and b is = " + multiply(a, b));
		System.out.println("The division of d and c is = " + divide(d, c));
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
	public static double divide(double d, double c) {
		return d / c;
	}
	
}
