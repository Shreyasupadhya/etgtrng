package com.sonata;

public class Tester extends Employee {
	public void salCal(){
		double total=empSal + 2000;
		System.out.println("Total Salary is: "+total);
		}

	public static void main(String[] args) {
		Tester t1=new Tester();
		t1.empId=214;
		t1.empName="ghi";
		t1.empSal=20000;
		t1.display();
		t1.salCal();

	}

}
