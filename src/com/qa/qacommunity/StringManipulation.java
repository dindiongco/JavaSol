package com.qa.qacommunity;

public class StringManipulation {

	public static void main(String[] args) {
		
		String sun = "today it is sunny, ";
		String rain = "yesterday it was raining";
		
		String capSun = sun.toUpperCase();
		String capRain = rain.toUpperCase();
		
		String weather = capSun.concat(capRain);
		System.out.println(weather);
		
		String weatherSub = weather.substring(0,11);
		String weatherSub2 = weather.substring(35,43);
		
		System.out.println(weatherSub + weatherSub2);
		
		count("String");
		vertical("Hard Rock Cafe");
		reverseVertical("Hard Rock Cafe");
		message("Hello there", "Hello");

	}
	
	private static void count(String a) {
		
		System.out.println(a.length());
		
	}
	
	private static void vertical(String a) {
		int space = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.substring(i, i + 1).contentEquals(" ") || i == (a.length()-1)) {
				System.out.println(a.substring(space, i + 1));
				space = i + 1;
			}
						
		}
	}
	
	private static void reverseVertical(String a) {
		
		System.out.println(a.substring(10, 14) + "\n" + a.substring(5, 9) + "\n" + a.substring(0, 4));
	}
	
	private static void message(String a, String b) {
		
		System.out.println(a.equals(b));
	}

}
