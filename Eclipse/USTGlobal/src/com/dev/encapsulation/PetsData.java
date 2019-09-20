package com.dev.encapsulation;

public class PetsData {

	public static void main(String[] args) {
		
		Pets pt=new Pets();
		Pets pt1=new Pets();
		
		Pets pt2=new Pets();
		Pets pt3=new Pets();
		
		Pets pt4=new Pets();
		Pets pt5=new Pets();
		
		
		pt.setAge(1);
		pt.setAnimal("Dog");
		pt.setName("Pororo");
		pt.setColor("Black");
		
		pt1.setAge(2);
		pt1.setAnimal("Dog");
		pt1.setName("Spike");
		pt1.setColor("Brown");
		
		pt2.setAge(1);
		pt2.setAnimal("Cat");
		pt2.setName("abc");
		pt2.setColor("White");
		
		pt3.setAge(2);
		pt3.setAnimal("Cat");
		pt3.setName("xyz");
		pt3.setColor("Brown");
		
		pt2.setAge(1);
		pt2.setAnimal("Bird");
		pt2.setName("Parrot");
		pt2.setColor("Green");
		
		pt3.setAge(2);
		pt3.setAnimal("Bird");
		pt3.setName("Peacock");
		pt3.setColor("Blue");
		
		Pets []dog= {pt,pt1};
		for(int i=0;i<dog.length;i++)
		{
			System.out.println("Age: "+dog[i].getAge());
			System.out.println("Animal: "+dog[i].getAnimal());
			System.out.println("Name: "+dog[i].getName());
			System.out.println("Color: "+dog[i].getColor());
			System.out.println("**************************");
		}
		
		Pets []cat= {pt2,pt3};
		for(int i=0;i<cat.length;i++)
		{
			System.out.println("Age: "+cat[i].getAge());
			System.out.println("Animal: "+cat[i].getAnimal());
			System.out.println("Name: "+cat[i].getName());
			System.out.println("Color: "+cat[i].getColor());
			System.out.println("****************************");
		}
		
		Pets []bird= {pt2,pt3};
		for(int i=0;i<cat.length;i++)
		{
			System.out.println("Age: "+bird[i].getAge());
			System.out.println("Animal: "+bird[i].getAnimal());
			System.out.println("Name: "+bird[i].getName());
			System.out.println("Color: "+bird[i].getColor());
			System.out.println("****************************");
		}
		

	}

}
