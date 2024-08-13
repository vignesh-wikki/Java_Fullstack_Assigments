package com.assignments;

class Animal{
	void makeSound() {
		System.out.println("Animal sound");
	}
}

class Cat extends Animal{
	
	void makeSound() {
		System.out.println("Cat sound");
	}
	
}

public class Ques1 {
	public static void main(String []a) {
		Cat cat = new Cat();
		cat.makeSound();
		Animal ani = new Animal();
		ani.makeSound();
	}

}
