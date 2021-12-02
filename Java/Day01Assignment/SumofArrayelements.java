package com.sonata;

public class SumofArrayelements {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		int b=0;
		int i;
		for(i=0;i<6;i++) {
			b=b+a[i];
		}
		System.out.println("Sum of array elements "+b);
	}

}
