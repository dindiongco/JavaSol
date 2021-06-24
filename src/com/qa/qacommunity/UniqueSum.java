package com.qa.qacommunity;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(uniSum (1,1,3));
		System.out.println(uniSum(10, 10, 2000));
	}
	
	public static int uniSum(int num1, int num2, int num3) {
		int unique = 0;
		
		if (num1 != num2 && num1 != num3) {
			unique += num1;
		}
					
		if (num2 != num1 && num2 != num3) {
			unique += num2;
		}
					
		if (num3 != num1 && num3 != num2) {
			unique += num3;
		}
		
			return unique;
		
		
	}
	

}
