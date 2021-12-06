package com.sonata;

public class Manager extends Employee {
	
	public void salCal(){
		double total=empSal + 5000;
		System.out.println("Total Salary is: "+total);
		}

	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.empId=212;
		m1.empName="abc";
		m1.empSal=25000;
		m1.display();
		m1.salCal();
		
		

	}

}
