package com.sonata;

public class ReplaceVowels {
	public static void main(String args[]) {
		int i;
		String a="Shreyas";
		char [] ch=a.toCharArray();
		for (i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') {
				ch[i]='$';
			}
			
		}
		for (i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
	}
	

}
