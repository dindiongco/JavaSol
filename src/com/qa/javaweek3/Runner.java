package com.qa.javaweek3;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<User> people = new ArrayList<User>();
		
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		u1.setForename("Bob");
		u1.setSurname("Builder");
		u1.setAge(45);
		u1.setEmail("bobthebuilder@gmail.com");
		u1.setTelephoneNo(01);
		u1.setMiddleNames("The");
						
		u2.setForename("Fred");
		u2.setSurname("Perry");
		u2.setAge(35);
		u2.setEmail("fredperry@gmail.com");
		u2.setTelephoneNo(02);
		u2.setMiddleNames("Eagle Flies");
				
		u3.setForename("Jess");
		u3.setSurname("Owens");
		u3.setAge(28);
		u3.setEmail("jessowens@gmail.com");
		u3.setTelephoneNo(03);
		u3.setMiddleNames("Ica");
		
		people.add(u1);
		people.add(u2);
		people.add(u3);
		
		for (User p: people) {
			System.out.println(p);
			System.out.println("-----");
		}

	}

}
