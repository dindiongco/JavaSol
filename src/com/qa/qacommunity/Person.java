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