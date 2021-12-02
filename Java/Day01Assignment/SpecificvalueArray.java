package com.sonata;

public class SpecificvalueArray {
	public static void main(String args[]) {
		int [] a= {1,2,3,4,5,6};
		int i;
		for(i=0;i<a.length;i++) {
			if (6==a[i]) {
				System.out.println("Number found");
				break;
			}
			
		}
	}

}
