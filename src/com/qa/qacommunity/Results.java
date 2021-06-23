package com.qa.qacommunity;

public class Results {

	public static void main(String[] args) {
		int phys = 130;
		int chem = 100;
		int bio = 50;
		int total = 280;
		System.out.println("Student has received " + phys + " marks in his Physics exam.");
		System.out.println("Student has received " + chem + " marks in his Chemistry exam.");
		System.out.println("Student has received " + bio + " marks in his Biology exam.");
		System.out.println("The Student's total marks is " + total + ".");
		System.out.println("The Student's overall percentage is " + percentage(total) + "%.");
	}
	public static int percentage(int total) {
		return (total * 100) / 450;
	}
}
