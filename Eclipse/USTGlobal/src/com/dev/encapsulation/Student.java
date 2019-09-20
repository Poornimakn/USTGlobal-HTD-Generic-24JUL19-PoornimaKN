package com.dev.encapsulation;

public class Student { //encapsulated class

	private int regno;
	private String name;
	private String email;
	private String password;
	
	public int getRegno() {
		return regno;		//if no setters for regno then we can't write it we can only read it
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public void setPassword(String password) { //it does not have getters so we can't read we can write only.
		this.password = password;
	}
	
	
}
