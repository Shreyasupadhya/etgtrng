/**
 * 
 */
package com.sonata;

/**
 * @author shreyas.hr
 *
 */
public class HighestCount {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,1,2,1};
		int i;
		int j;
		int count=0;
		for (i=0;i<a.length;i++) {
			for (j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					count= count+1;
					if (count>3) {
						System.out.println(a[i]);
					}
					
				}
			}
		}
	}

}
