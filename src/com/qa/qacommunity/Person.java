package com.qa.qacommunity;

// import java.util.ArrayList;
// import java.util.List;

public class Person {
	
	private String name;
	private int age;
	private String job_title;

	public Person() {
		
	}
	
	public Person(String name, int age, String job_title) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
		 
	}
	
	public void printInfo() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nJob Title: " + job_title);
	}
	

}
/*
Person bob = new Person("Bob", 63,"Senior Developer");
Person fred = new Person("Fred", 23, "Junior Developer");
Person jess = new Person("Jess", 21, "Junior Developer");

List<Person> list = new ArrayList<Person>();
list.add(fred);
list.add(bob);
list.add(jess);

for (int i = 0; i < list.size(); i++) {
	list.get(i).printInfo(); */