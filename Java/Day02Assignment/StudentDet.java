package com.sonata;

public class StudentDet {
	int stdID;
	String stdName;
	int stdClass;
	public void display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	public static void main(String args[]) {
		StudentDet s1=new StudentDet();
		StudentDet s2=new StudentDet();
		s1.stdID=23;
		s1.stdName="abc";
		s1.stdClass=3;
		s1.display();
		s2.stdID=25;
		s2.stdName="xyz";
		s2.stdClass=4;
		s2.display();
	}
}
