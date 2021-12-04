package com.sonata;

public class Truck extends Car{
	int weight;
	public double getSalePrice(int weight) {
		double total=super.getSalePrice()*0.8;
		if(weight>2000) {
			total=super.getSalePrice()*0.9;
		}
		return total;
	}
	
	public static void main(String args[]) {
		Truck t1= new Truck();
		t1.speed=300;
		t1.regularPrice=1000000;
		t1.color="red";
		
		t1.display();
		System.out.println(t1.getSalePrice(2050));
	}

}
