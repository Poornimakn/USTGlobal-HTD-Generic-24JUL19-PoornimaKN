package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		
		Student s = new Student(); //all the members in student class is non-static so we need to create object to access it
		s.setRegno(2019001);
		s.setName("Poo");
		s.setEmail("poo@gmail.com"); // setting the members present in student class
		s.setPassword("123poo");
		
		int regno = s.getRegno();
		System.out.println("Regno: "+regno);
		String name = s.getName();
		System.out.println("Name: "+name);
		System.out.println("Email: "+s.getEmail());
		System.out.println("Password: **********");

	}

}
