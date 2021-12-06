package com.sonata;

public class Triangle extends Shape {
	public double area() {
		double total=0.5*height*width;
		return total;
	}

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.height=4;
		t1.width=3;
		System.out.println(t1.area());
		

	}

}
