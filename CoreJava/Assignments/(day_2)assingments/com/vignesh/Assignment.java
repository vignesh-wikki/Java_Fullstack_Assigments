package com.vignesh;

import java.util.*;

class Student{
	
	int registrationNumber;
	
	String studentName;
	
	int sum;
	
	int[] arr = new int[5];
	
	Student(int registrationNumber,String studentName) {
		
		this.registrationNumber = registrationNumber;
		
		this.studentName = studentName;
		
		this.sum = 0;
		
	}
	
	public void getMarks() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
	
		
	}
	
	public void display() {
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("Total marks of student : "+ sum);
		
		System.out.println();
		
	}
	
	public void averageMark() {
		
		System.out.println("Average mark of student : "+ (sum/arr.length));
		
		System.out.println();

		
	}
	
	public void grades() {
		
		char a = 'A';
		
		char b = 'B';
		
		String f = "Fail";
		
		if(sum > 90) {
			
			System.out.println("Student grade is : "+a);
			
		}else if(sum <90 && sum>50) {
			
			System.out.println("Student grade is : "+b);
			
		}
		else {
			
			System.out.println("Student grade is : "+f);
			
		}
		
	}
	
	
}

public class Assignment {

	public static void main(String[] args) {
		
		Student obj = new Student(101,"Vignesh");
		
		obj.getMarks();
		
		obj.display();
		
		obj.averageMark();
		
		obj.grades();

	}

}
