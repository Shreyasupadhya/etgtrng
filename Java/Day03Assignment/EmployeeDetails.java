package com.sonata;

public abstract class EmployeeDetails extends Address{
	int employeeId;
	String employeeName;
	double basicPay;
	int numberofLeave;
	Address a1=new Address();
	public abstract double calSalary() ;
	public void display() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(basicPay);
		System.out.println(numberofLeave);
		System.out.println(a1);
	}
		
		
	}

