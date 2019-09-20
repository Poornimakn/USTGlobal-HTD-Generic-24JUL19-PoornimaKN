package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Employee;

public class C3 {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts= new TreeSet<Employee>();
		
		Employee e = new Employee();
		e.setId(60);
		e.setName("Poo");
		e.setEmail("poo@gmail.com");
		e.setPassword("poo123");
		
		Employee e1= new Employee();
		e1.setId(20);
		e1.setName("Inchu");
		e1.setEmail("inchu@gmail.com");
		e1.setPassword("inchu123");
		
		
		Employee e2= new Employee();
		e2.setId(30);
		e2.setName("Lux");
		e2.setEmail("lux@gmail.com");
		e2.setPassword("lux123");
		
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);
	
	}

}
