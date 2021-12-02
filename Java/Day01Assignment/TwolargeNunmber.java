package com.sonata;

public class TwolargeNunmber {
	public static void main(String args[]) {
		int a[]= {1,6,3,5,4,2};
		int i;
		int larA=a[0];
		int larB=a[0];
		for (i=0;i<a.length;i++) {
			if(a[i]>larA) {
				larA=a[i];
			}
			if(a[i]<larA) {
				if(larB<a[i]) {
					larB=a[i];
				}
			}
		}
		System.out.println(larA );
		System.out.println(larB);
	}

}
