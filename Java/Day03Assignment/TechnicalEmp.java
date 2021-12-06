package com.sonata;

public class TechnicalEmp extends EmployeeDetails{
	public double calSalary() {
		double salary=basicPay+(0.12*basicPay);
		return salary;
	}
	

}
