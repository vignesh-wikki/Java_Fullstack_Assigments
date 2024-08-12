package com.vignesh;

class Employee1{
	private String name;
	private String jobTitle;
	private float salary;
	
	Employee1(String name,String jobTitle, float salary){
		this.name=name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Job Title : "+this.jobTitle);
		System.out.println("Employee Salary : "+this.salary);
	}
	
	public void setter(String name,String jobTitle,float salary) {
		this.name=name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
}

public class Ques6 {
	public static void main(String []a) {
		Employee1 obj = new Employee1("Vignesh","CTO",200000);
		obj.display();
		obj.setter("Shivan","CEO", 100000);
		obj.display();
		
		
		
	}
}
