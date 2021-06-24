package com.qa.qacommunity;

public class Arrays {
	
	public static int[] valueTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static int[] timesTen = new int[10];
	
	
	
	public static void main(String[] args) {
		for (int i : valueTen) {
			System.out.println("Number: " + i);
		}
		
		
		for (int j = 0; j < timesTen.length; j++) {
			System.out.println("New Number: " + j * 10);
		}
		
		

	}
	
	

}
