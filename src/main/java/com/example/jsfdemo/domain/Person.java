package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
	
	private String firstName = "exFirstName";
	private String lastName = "exLastName";
	private String pin = "9301";
	private String about = "exAbout";
	
	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Size(min = 2, max = 20)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Size(min = 2, max = 6)
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

	@Size(min = 2, max = 40)
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
}