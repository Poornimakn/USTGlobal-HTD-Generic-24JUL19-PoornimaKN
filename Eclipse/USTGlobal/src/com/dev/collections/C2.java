package com.dev.collections;

import java.util.HashMap;

import com.dev.encapsulation.Pets;
public class C2 {

	public static void main(String[] args) {
		
		HashMap<String,Pets> hm= new HashMap<String,Pets>();
		
		Pets p= new Pets();
		p.setAge(1);
		p.setColor("White");
		p.setName("Shiro");
		
		Pets p1= new Pets();
		p1.setAge(1);
		p1.setColor("Black");
		p1.setName("Ronnie");
		
		Pets p2= new Pets();
		p2.setAge(2);
		p2.setColor("Brown");
		p2.setName("Rockie");
		
		hm.put("1",p); // if we don't give this,then o/p will be null, 1 is the set no of p obj
		hm.put("2",p1); 
		hm.put("3",p2); 
		
		System.out.println(hm);
		
//		Pets b=hm.put("1",p); // put() return type is object type that is binary so we have given Pets
//		System.out.println(b);
//		System.out.println(b);
//		System.out.println(b);
		
		Pets f=hm.remove("2"); // o/p will be the obj we removed i.e., 2nd key
		System.out.println(f);
		System.out.println(hm);

		System.out.println("Output of ContainsKey(): "+hm.containsKey("2")); //contains() gives boolean o/p
		
		System.out.println("Output of ContainsValue(): "+hm.containsValue(p2));
		
	}

}
