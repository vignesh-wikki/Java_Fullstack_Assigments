package com.assignments;

class Vehicle{
	void drive() {
		System.out.println("Vehicle in vehicle class");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing car");
	}
}
public class Ques2 {
	public static void main(String []a) {
		Car car = new Car();
		car.drive();
		Vehicle obj = new Vehicle();
		obj.drive();
	}
}
