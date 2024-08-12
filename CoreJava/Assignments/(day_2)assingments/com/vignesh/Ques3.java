package com.vignesh;

class Reactangle{
	int width;
	int height;
	
	public int area(int width, int heigth) {
		return width*heigth;
	}
	
	public int perimeter(int width, int heigth) {
		return (width+heigth)*2;
	}
	
}
public class Ques3 {
	
	public static void main(String[] args) {
		Reactangle obj = new Reactangle();
		
		System.out.println("Area of Reactangle : "+obj.area(10,10));
		System.out.println("Perimetr of Reactangle : "+obj.perimeter(20,20));
	}

}
