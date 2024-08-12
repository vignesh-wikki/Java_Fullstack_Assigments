package com.vignesh;

class Book{
	String title;
	String author;
	String ISBN;
	
	public void setter(String title,String author,String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		
		System.out.println(this.title+" "+this.author+" "+this.ISBN);
		
	}
}

public class Ques5 {

	public static void main(String[] args) {
		Book obj = new Book();
		
		obj.setter("Honor", "Vignesh", "hGY7");
	}

}
