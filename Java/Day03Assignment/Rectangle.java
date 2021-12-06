package com.sonata;

public class Rectangle extends Shape {
	public double area() {
		double total=length*width;
		return total;
	}

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.length=4;
		r1.width=3;
		System.out.println(r1.area());
		

	}

}
