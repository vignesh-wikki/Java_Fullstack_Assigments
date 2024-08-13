package com.assignments;

class Animalss{
	void move() {
		System.out.println("Animal is moving");
	}
}
class Cheetah extends Animalss{
	void move() {
		System.out.println("Cheetah is moving");
	}
}

public class Ques6 {

	public static void main(String[] args) {
		Animalss ani = new Cheetah();
		
		ani.move();
		Cheetah che = new Cheetah();
		che.move();
	}

}
