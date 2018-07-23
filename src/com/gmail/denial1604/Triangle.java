package com.gmail.denial1604;

public class Triangle {
	double a;
	double b;
	double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public Triangle() {
		super();
	}

	public double getArea() {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
