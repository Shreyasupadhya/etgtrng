package com.sonata;

public class MyOwnAutoShop extends Car {

	public static void main(String[] args) {
		Sedan s1=new Sedan();
		s1.color="grey";
		s1.regularPrice=150000;
		s1.speed=150;
		s1.display();
		System.out.println(s1.getSalePrice(21));

		Ford f1=new Ford();
		f1.color="yellow";
		f1.regularPrice=100000;
		f1.speed=180;
		f1.year=2021;
		f1.display();
		System.out.println(f1.getSalePrice(10000));
		
		Car c1=new Car();
		c1.color="red";
		c1.regularPrice=1000000;
		c1.speed=160;
		c1.display();
		System.out.println(c1.getSalePrice());
	}

}
