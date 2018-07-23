package com.gmail.denial1604;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle trOne = new Triangle(0.4, 0.3, 0.5);
		Triangle trTwo = new Triangle(0.6, 0.8, 0.5);
		Triangle trThree = new Triangle(1.2, 2.5, 1.6);

		double sqr = trOne.getArea();
		System.out.println(sqr);
		sqr = trTwo.getArea();
		System.out.println(sqr);
		sqr = trThree.getArea();
		System.out.println(sqr);
	}

}
