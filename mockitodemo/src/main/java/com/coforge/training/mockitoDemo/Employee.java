package com.coforge.training.mockitoDemo;

public class Employee {
public String firstName;
public String LastName;
public int age;


public Employee(String firstName, String lastName, int age) {
	this.firstName = firstName;
	LastName = lastName;
	this.age = age;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getFullName() {
	return(getFirstName()+" "+getLastName());
}

	
	
	
}
