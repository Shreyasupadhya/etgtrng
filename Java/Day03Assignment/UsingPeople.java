package com.sonata;

public class UsingPeople {

	public static void main(String[] args) {
		TechnicalEmp e1=new TechnicalEmp();
		e1.basicPay=25000;
		e1.employeeId=211;
		e1.employeeName="abc";
		e1.numberofLeave=5;
		e1.pin=560078;
		e1.city="bgl";
		e1.doorNo=32;
		e1.display();
		System.out.println(e1.calSalary());
		
		StaffMember s1=new StaffMember();
		s1.basicPay=14000;
		s1.employeeId=214;
		s1.employeeName="xyz";
		s1.numberofLeave=2;
		s1.pin=560072;
		s1.city="bgl";
		s1.doorNo=12;
		s1.display();
		System.out.println(s1.calSalary());
		
		

	}

}
