package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Person bob = new Person("Bob", 63,"Senior Developer");
		Person fred = new Person("Fred", 23, "Junior Developer");
		Person jess = new Person("Jess", 21, "Junior Developer");
		
		List<Person> list = new ArrayList<Person>();
		list.add(fred);
		list.add(bob);
		list.add(jess);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).printInfo();
		}
	}

}
