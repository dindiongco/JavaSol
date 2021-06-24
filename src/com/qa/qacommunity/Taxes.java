package com.qa.qacommunity;

public class Taxes {

	public static void main(String[] args) {
		
		System.out.println(salary(15000));

	}
	
	public static float salary(float a) {
		
		if (a < 15000) {
			return a;
		}
		
		else if (a < 20000) {
			return (float) (a * 0.9);
		}
		else if (a < 30000) {
			return (float) (a * 0.85);
		}
		else if (a < 45000) {
			return (float) (a * 0.8);
		}
		
		else {
			return (float) (a * 0.75);
		}
	
	}
}
