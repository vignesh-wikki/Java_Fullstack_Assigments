package com.vignesh;

class Dog{
	
	private String name;
	
	private String breed;
	
	Dog(){}
	
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
		System.out.println(name+" "+breed);
	}
	
	public void setter() {
		this.name = "Petter";
		this.breed = "H-Dog";
		
		System.out.println(name+" "+breed);
	}
}
public class Ques2 {
	public static void main(String[] args) {
		
		Dog obj1 = new Dog("Harry","Puppy");
		
		Dog obj2 = new Dog();
		
		obj2.setter();

	}

}
