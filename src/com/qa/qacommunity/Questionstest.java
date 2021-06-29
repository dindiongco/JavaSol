package com.qa.qacommunity;

public class Questionstest {

	public static void main(String[] args) {
		multiChar("Hi");
	}
	
	public static void multiChar(String input) {
		
		for (char c: input.toCharArray()) {
			System.out.println(c * c * c);
		}
		
	}

}
