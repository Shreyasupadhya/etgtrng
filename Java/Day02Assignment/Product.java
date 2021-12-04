package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	public double addTax() {
		double total = proPrice*1.02;
		return total;
	}
	public void display() {
		System.out.println(proID);
		System.out.println(proName);
		System.out.println(proPrice);
	}

	public static void main(String[] args) {
		Product p1=new Product();
		p1.proID=34;
		p1.proName="toothpaste";
		p1.proPrice=34.25;
		p1.display();
		System.out.println(p1.addTax());

	}

}
