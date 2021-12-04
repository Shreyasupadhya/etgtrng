package com.sonata;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;
	public double getSalePrice(int manufacturerDiscount) {
		double total=super.getSalePrice()-manufacturerDiscount;
		return total;
	}

	public static void main(String[] args) {
		Ford f1=new Ford();
		f1.color="yellow";
		f1.regularPrice=100000;
		f1.speed=180;
		f1.year=2021;
		f1.display();
		System.out.println(f1.getSalePrice(10000));

	}

}
