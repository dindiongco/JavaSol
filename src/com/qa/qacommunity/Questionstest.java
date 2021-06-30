package com.qa.qacommunity;

public class Questionstest {

	public static void main(String[] args) {

		System.out.println(sandwichFilling("xxxbreaDoutputbReadxxx"));

	}

	public static String sandwichFilling(String sandwich) {

		String output = "";
		

		String between = sandwich.substring(sandwich.toLowerCase().indexOf("bread"), sandwich.toLowerCase().lastIndexOf("bread"));

		if (!sandwich.toLowerCase().matches(".*bread.*bread.*")) {
		      return "";
		    }
		else {
			
		for (int i = between.length() - 1; i >= 0; i--) {
				output = output + between.charAt(i);
			}
			return output;
		}

	}

}
