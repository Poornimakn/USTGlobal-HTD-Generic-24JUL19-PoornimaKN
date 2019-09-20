package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Employee;
import com.dev.encapsulation.Pets;
public class C1 {

	public static void main(String[] args) {
		HashSet<Pets> hs = new HashSet<Pets>(); //creating obj for pets hashset
		Pets p= new Pets();
		p.setAge(1);
		p.setColor("White");
		p.setName("Shiro");
		
		Pets p1= new Pets();
		
		p1.setAge(1);
		p1.setColor("black");
		p1.setName("Ronnie");
		
		boolean b=hs.add(p); // hashset add method
		boolean b1=hs.add(p1);
		System.out.println("Output of add(): "+b);
		System.out.println(b1);
		System.out.println(hs); // firstly it only displays address so to get ele go to source generate tostring() for only fields in pets class 
	
		for(Pets pet:hs) {
			System.out.println(pet);
		}
		
//		boolean b2=hs.remove(p); // hashset remove method
//		System.out.println("Output of remove(): " +b2);
//		System.out.println(hs);
//		
//		System.out.println("Output of Contains(): " +hs.contains(p)); //contains method
//		
//		System.out.println("Size of HashSet hs: "+hs.size()); // size()
//		
//		hs.clear(); // clear
//		System.out.println("Size of HashSet hs: "+hs.size());
//		
//		System.out.println("********************************************");
//		
//		HashSet<Employee> hs1= new HashSet<Employee>();
//		
//		Employee e1= new Employee();
//		e1.setId(10);
//		e1.setName("Poo");
//		e1.setEmail("poo@gmail.com");
//		e1.setPassword("poo123");
//		
//		
//		Employee e2= new Employee();
//		e2.setId(20);
//		e2.setName("Inchu");
//		e2.setEmail("inchu@gmail.com");
//		e2.setPassword("inchu123");
//		
//		
//		Employee e3= new Employee();
//		e3.setId(30);
//		e3.setName("Lux");
//		e3.setEmail("lux@gmail.com");
//		e3.setPassword("lux123");
//		
//		boolean be= hs1.add(e1);
//		boolean be1= hs1.add(e2);
//		boolean be2= hs1.add(e3);
//		
//		System.out.println("Output of add(): "+be);
//		System.out.println("Output of add(): "+be1);
//		System.out.println("Output of add(): "+be2);
//		
//		System.out.println(hs1);
//		
//		boolean be3= hs1.remove(e1);
//		System.out.println("Output of remove(): "+be3);
//		
//		System.out.println(hs1);
//			
//		e2.setEmail("inchuuuuuuuu@gmail.com");
//		
//		System.out.println(hs1);
//		
//		System.out.println("Output of Contains(): " +hs.contains(e1));
//		
//		System.out.println("Size of HashSet hs1: "+hs1.size());
//		
//		hs1.clear();
//		
//		System.out.println("Size of HashSet hs1: "+hs1.size());
//		
//		System.out.println("*****************************");
//		
//		
		}

}
