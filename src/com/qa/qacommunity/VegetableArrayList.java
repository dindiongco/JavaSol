package com.qa.qacommunity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VegetableArrayList {

	public static void main(String[] args) {
		
		List<String> vegetables = new ArrayList<>();
		
		vegetables.add("Bell peppers");
		vegetables.add("Spinach");
		vegetables.add("Potatoes");
		vegetables.add("Onions");
		vegetables.add("Sweet Potatoes");
		
		System.out.println(vegetables);
		
		for (int i = 0; i < vegetables.size(); i++) {
			System.out.println(vegetables.get(i));
		}
		for (String j : vegetables) {
			System.out.println(j);
		}
		
		vegetables.get(4);
		vegetables.set(0, "Kale");
		// vegetables.remove(1);
		Collections.sort(vegetables);
		System.out.println(vegetables);
		// Collections.reverse(vegetables);
		// Collections.swap(vegetables, 0, 1);
		
	}

}
