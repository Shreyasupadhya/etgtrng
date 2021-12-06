package com.sonata;

public class Square extends Shape {
	public double area() {
		double total=length*2;
		return total;
	}

	public static void main(String[] args) {
		Square s1=new Square();
		s1.length=4;
		System.out.println(s1.area());

	}

}
