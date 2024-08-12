package com.vignesh;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public void display() {
		System.out.println("Employee id: " + employeeId);
		System.out.println("Employee name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}
}

public class Myclass {

	public static void main(String[] args) {
		Employee obj = new Employee(101,"Vignesh",100000.00f);
		obj.display();
		
		System.out.println();
		Employee obj1 = new Employee(102,"Vicky",200000.00f);
		obj1.display();
		

	}

}
