package com.qa.javaweek3;

public class User {

	private String forename;
	private String surname;
	private int age;
	private String email;
	private int telephoneNo;
	private String middleNames;

	public String getForename() {
		return this.forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		}
	}

	public int getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getMiddleNames() {
		return this.middleNames;
	}

	public void setMiddleNames(String middleNames) {
		this.middleNames = middleNames;
	}

	@Override
	public String toString() {
		return "User [forename: " + forename + ", surname: " + surname + ", age: " + age + ", email: " + email
				+ ", telephoneNo: " + telephoneNo + ", middleNames: " + middleNames + "]";
	}
		
}
