package com.qa.iterations;

public class EnhancedForLoop {

	public static String[] namesArray = {"Fred", "Bob", "John"};
	public static int[] numbersArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	
	public static void main(String[] args) {
		
		for (String i: namesArray) {
			System.out.println(i);
		}
		
		for (int j: numbersArray) {
			System.out.println((j * j));
		}
		for (int k: numbersArray) {
			if (checkEven(k) == true) {
				System.out.println(k * k * k);
			}
			if (checkEven(k) == false) {
				System.out.println(k * k);
			}
		}
				
	}
		
	public static boolean checkEven(int a) {
		
		if (a % 2 == 0) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
}
