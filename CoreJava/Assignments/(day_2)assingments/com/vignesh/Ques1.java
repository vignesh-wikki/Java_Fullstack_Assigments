package com.vignesh;
import java.util.*;

class Person{
	
	String name;
	
	int age;
	
	Person(String name){
		this.name = name;
		
		System.out.println("Name of the Person : "+name);
		
	}
	Person(int age){
		this.age = age;
		System.out.println("Age of the Person : "+age);
	}
}

public class Ques1 {
	public static void main(String[] args) {
		Person obj = new Person("Vignesh");
		Person obj1 = new Person(21);
		
	}

}
