package com.vignesh;

public class Methods {
	void method1() {
		System.out.println("Instance or object method");
	}
	static void method2() {
		System.out.println("Static or class method");
	}

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		
		obj.method1();
		
		Methods.method2();
		
		method2();
	}

}
