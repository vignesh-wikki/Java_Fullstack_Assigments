package com.vignesh;

class circle{
	
	private float radius = 10;
	
	private float pi = 3.14f;

	
	public float area() {
		
		return pi*(radius*radius);
		
	}
	
	public float circumference() {
		
		return (2*pi)*radius;
		
	}
	
	public void setter(float radius) {
		
		this.radius = radius;
		
	}
	
}

public class Ques4 {

	public static void main(String[] args) {
		circle obj = new circle();
		
		System.out.println(obj.area());
		System.out.println(obj.circumference());
		obj.setter(21);
		System.out.println(obj.area());
		System.out.println(obj.circumference());
		
		
;
	}

}
