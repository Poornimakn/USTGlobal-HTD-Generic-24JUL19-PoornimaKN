package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Pets;

public class C4 {

	public static void main(String[] args) {
		
		ArrayList<Pets> al= new ArrayList<Pets>(2); //array being resized on its own i have given 2 ele here but inserted 3
		
		Pets p= new Pets();
		p.setAge(10);
		p.setColor("White");
		p.setName("Shiro");
		
		Pets p1= new Pets();
		p1.setAge(6);
		p1.setColor("Black");
		p1.setName("Ronnie");
		
		Pets p2= new Pets();
		p2.setAge(2);
		p2.setColor("Brown");
		p2.setName("Rockie");
		
		al.add(p);
		al.add(p1);
		al.add(p2);
		
		System.out.println(al);
//		System.out.println("Size of ArrayList before trimToSize(): "+al.size());
		
		al.trimToSize();
		
		System.out.println("Size of ArrayList before trimToSize(): "+al.size());
		

	}

}
