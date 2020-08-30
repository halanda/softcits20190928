package com.softcits.liu.Testextends;

public class Animal {

	public String name;
	double  weight;
	protected double height;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String name, double weight, double height, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", height=" + height + ", age=" + age + "]";
	}
	
	public void run() {
		System.out.println("∂ØŒÔ≈‹");
	}
	
}
