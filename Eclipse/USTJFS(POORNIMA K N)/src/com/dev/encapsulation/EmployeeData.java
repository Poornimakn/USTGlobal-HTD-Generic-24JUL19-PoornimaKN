package com.dev.encapsulation;

import java.util.HashMap;

public class EmployeeData extends Employee{

	public static void main(String[] args) {
		
		HashMap<String,Employee> hm = new HashMap<String,Employee>();
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e.setEmpid(10);
		e.setEname("Poornima");
		e.setEmail("poornimaknblr@gmail.com");
		e.setPassword("123poornima456");
		e.setSalary(25966.233);
		
		e1.setEmpid(20);
		e1.setEname("Inchara");
		e1.setEmail("inchara@gmail.com");
		e1.setPassword("inch123564");
		e1.setSalary(26686.231);
		
		e2.setEmpid(30);
		e2.setEname("Lakshmi");
		e2.setEmail("lakshmi@gmail.com");
		e2.setPassword("lakshmi5645");
		e2.setSalary(32882.231);
		
		hm.put("1",e);
		hm.put("2",e1);
		hm.put("3",e2);
		
		System.out.println(hm);
		
		Employee e4 = hm.remove("2");
		
		System.out.println(e4);
		System.out.println(hm);
		
		System.out.println("Output of Contains Value:"+hm.containsValue(e1));
		
		System.out.println("Output of Contains Key:"+hm.containsKey("1"));
		
	}

}
