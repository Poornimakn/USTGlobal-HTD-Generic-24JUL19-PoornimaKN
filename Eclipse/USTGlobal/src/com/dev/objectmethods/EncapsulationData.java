package com.dev.objectmethods;

public class EncapsulationData {

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		Encapsulation en1 = new Encapsulation();
		Encapsulation en2 = new Encapsulation();
		
		en.setAge(1);
		en.setBreed("Dober Man");
		en.setColor("Black");
		en.setName("Shiro");
		 
		en1.setAge(3);
		en1.setBreed("German Shepherd");
		en1.setColor("Brown");
		en1.setName("Abby");
		
		en2.setAge(3);
		en2.setBreed("German Shepherd");
		en2.setColor("Brown");
		en2.setName("Abby");
		
		Encapsulation[] ens = {en,en1,en2};
		for(int i=0;i<ens.length;i++)
		{
//			System.out.println("Age: "+ens[i].getAge());
//			System.out.println("Breed: "+ens[i].getBreed());
//			System.out.println("Color: "+ens[i].getColor());
//			System.out.println("Name: "+ens[i].getName());
			System.out.println(ens[i]);
			System.out.println("**********************");
		}
		
		System.out.println(en1.equals(en2));
		System.out.println(en1.hashCode());
		System.out.println(en2.hashCode());

	}

}
