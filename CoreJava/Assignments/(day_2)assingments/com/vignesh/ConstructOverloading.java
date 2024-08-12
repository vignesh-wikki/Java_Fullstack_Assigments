package com.vignesh;

public class ConstructOverloading {

	ConstructOverloading(String name) {
		
		this(8979,989);
		    System.out.println("I am "+name);
		    
		
	    }
	    
	ConstructOverloading(int a,int b) {
		this(8);
	    	
	    	System.out.println("Addition : " + (a+b));
	    }
	    
	ConstructOverloading(int n) {
	    	
	    	int fact = 1;
	    	
	    	for(int i=1;i<=n;i++) fact*=i;
	    	
	    	System.out.println("Factorial : "+ fact);
	    	
	    }
	    public static void main(String [] a) {
	    	
	    	ConstructOverloading obj1 = new ConstructOverloading("Vicky");
	    	
	    }
}
