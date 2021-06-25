package com.qa.qacommunity;

public class IterationsFlowcharts {

	public static void main(String[] args) {
		int i = 100;
		int j = 100;
		
		for (i = 100; i < 201; i++) {
			System.out.println("A");
		}
		
		for (j = 100; j <= 200; j++) {
			if (j%2 == 0) {
				System.out.println("*" + "_");
			}
		}
		
		printNum();
		printNumValue();
	}
	
	private static void printNum() {
				
		for(int i = 1; i < 11; i++) {
			 System.out.println(i);
		}		
			        
	}
	
	private static void printNumValue() {
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}

}
