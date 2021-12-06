package com.sonata;

public class Developer extends Employee{
	public void salCal(){
		double total=empSal + 3000;
		System.out.println("Total Salary is: "+total);
		}

	public static void main(String[] args) {
		Developer d1=new Developer();
		d1.empId=213;
		d1.empName="def";
		d1.empSal=23000;
		d1.display();
		d1.salCal();
	}

}
