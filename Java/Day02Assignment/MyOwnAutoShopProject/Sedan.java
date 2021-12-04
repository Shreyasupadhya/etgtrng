package com.sonata;

public class Sedan extends Car {
	int length;
	public double getSalePrice(int length) {
		double total= super.getSalePrice()*0.9;
		if (length>20) {
			total=super.getSalePrice()*0.95;
		}
		return total;
	}
	

	public static void main(String[] args) {
		Sedan s1=new Sedan();
		s1.color="grey";
		s1.regularPrice=150000;
		s1.speed=150;
		s1.display();
		System.out.println(s1.getSalePrice(21));

	}

}
