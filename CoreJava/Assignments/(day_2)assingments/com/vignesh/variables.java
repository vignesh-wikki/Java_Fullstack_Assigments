package com.vignesh;

public class variables {
	
	int b = 20;
	
	static int c = 30;
	
	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println("Local variable : "+ a);
		
		variables obj = new variables();
		
		System.out.println(obj.b);
		
		System.out.println(c);
		
	}

}
