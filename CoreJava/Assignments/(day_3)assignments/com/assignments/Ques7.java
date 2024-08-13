package com.assignments;

class Person{
	private String name;
	private String lastName;
	public int id = 101;
	
	Person(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
		System.out.println(name+" "+lastName);
	}

	public Person() {
	}

	String getFirstName() {
		return this.name;
	}
	String getLastName() {
		return this.lastName;
	}
}

class Employees extends Person{

	Employees(String name, String lastName) {
		super(name, lastName);
	}
	int  getEmployeeId() {
		return super.id;
	}
    String getLastName() {
		String temp = super.getLastName();
				return temp+=" Tilte";
	}
}

public class Ques7 {

	public static void main(String[] args) {
		Employees em = new Employees("Vignesh","A");
		System.out.println(em.getFirstName());	
		System.out.println(em.getLastName());
		System.out.println(em.id);	
		
		Person per = new Person();
		
		System.out.println(per.getLastName());	
		
		}

}
