package com.assignments;

class Employee{
	void work() {
		System.out.println("Work from employee");
	}
	void getSalary() {
		System.out.println("Salary from employee");

	}
}

class HRManager{
void work() {
	System.out.println("Work from HRManager");

	}
	void getSalary() {
		System.out.println("Salary from HRManager");

	}
	void addEmployee() {
		System.out.println("addEmployee from HRManager");

	}
}



public class Ques4 {
	public static void main(String []a) {
		HRManager hr = new HRManager();
		
		hr.work();
		hr.getSalary();
		hr.addEmployee();
		
		Employee em = new Employee();
		em.work();
		em.getSalary();
	}
}
