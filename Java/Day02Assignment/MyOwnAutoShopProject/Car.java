package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String color;
	public double getSalePrice() {
		double total=regularPrice;
		return total;
	}
	public void display() {
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
	}

}
