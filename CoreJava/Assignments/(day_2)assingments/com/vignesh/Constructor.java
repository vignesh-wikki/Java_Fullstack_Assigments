package com.vignesh;

public class Constructor {
	
	String name;
	
	Constructor(String name){
		
		this(20,30);
		
		this.name = name;
		
		this.greeting();
	}
	
	Constructor(int a,int b){
		
		System.out.println("Sum :"+(a+b));
	}
	
	void greeting() {
		
		System.out.println("Welcome to "+name);
	}
	
	public static void main(String []a) {
		
		Constructor obj = new Constructor("Vignesh");
		
		
	}

}
