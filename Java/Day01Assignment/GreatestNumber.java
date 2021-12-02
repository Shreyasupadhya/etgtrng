package com.sonata;

public class GreatestNumber {
	public static void main(String args[]) {
		int a=12;
		int b=25;
		int c=89;
		int d;
		if(a>b) {
			d=a;
		}
		else {
			d=b;
		}
		if (d>c) {
			System.out.println("Greatest of three number is "+d);
		}
		else {
			System.out.println("Greatest of three number is "+c);
		}
	}

}
	
