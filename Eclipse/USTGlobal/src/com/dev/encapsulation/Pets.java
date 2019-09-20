package com.dev.encapsulation;

public class Pets {
	
	@Override
	public String toString() {
		return "Pets [age=" + age + ", animal=" + animal + ", name=" + name + ", color=" + color + "]";
	}
	private int age;
	private String animal;
	private String name;
	private String color;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}

}
