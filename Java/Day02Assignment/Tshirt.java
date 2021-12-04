package com.sonata;

public class Tshirt {
	String color;
	String material;
	String design;
	public void display() {
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}
	Tshirt (String s, String r,String t){
		this.color=s;
		this.material=r;
		this.design=t;
	}
	Tshirt(){}
	public static void main(String args[]) {
		Tshirt t1=new Tshirt();
		t1.color="red";
		t1.material="cotton";
		t1.design="halfsleeves";
		t1.display();
		Tshirt t2=new Tshirt("blue","nylon","fullsleeves");
		t2.display();
		Tshirt t3=new Tshirt("yellow","cotton","halfsleeves");
		t3.display();
		
		
	}

}
