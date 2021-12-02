package com.sonata;

public class ReverseArray {
	public static void main(String args[]) {
		int [] a= {1,2,3,4,5,6};
		int b[]=new int[6];
		int i;
		int j=6;
		for (i=0;i<6;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		for(i=0;i<6;i++) {
			System.out.println(b[i]);
		}
	}

}
