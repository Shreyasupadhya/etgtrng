package com.sonata;

public class SalaryAnnual {

	public static void main(String[] args) throws MyOwnException {
		int yearlySal=95000;
		if(yearlySal<100000) {
			throw new MyOwnException("Less Salary");
		}
		

	}

}
