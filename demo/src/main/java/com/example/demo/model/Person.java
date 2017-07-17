package com.example.demo.model;


import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Person implements Serializable{
	

	private String firstName;
	private String lastName;
	public Person()
	{
		
	}
public Person(String firstName,String LastName){
	this.firstName = firstName;
	this.lastName = lastName;
}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	  public String toString() {
	    return "first name=" + firstName + ", Last name ="+lastName;
	  }
}
