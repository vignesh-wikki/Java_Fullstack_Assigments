package com.assignments;


class Shape{
	public int area = 10;
	void getArea() {
		
	System.out.println("Area = 20");
}
}

class Reactangle extends Shape{
	void getArea() {
		System.out.println(super.area*super.area);
	}
}

public class Ques3 {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.getArea();
		Reactangle obj = new Reactangle();
		
		obj.getArea();
		
	}

}
