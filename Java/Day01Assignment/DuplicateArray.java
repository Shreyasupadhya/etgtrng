package com.sonata;

public class DuplicateArray {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,1,2};
		int i;
		int j;
		
		for (i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
						
				}
			}
		}
	}

}
