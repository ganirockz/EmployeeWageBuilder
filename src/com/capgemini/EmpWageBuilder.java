package com.capgemini;

public class EmpWageBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int part_time = 1,full_time =2;
		int empRatePerHour = 20,empHrs = 0,empWage = 0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if(empCheck == part_time)
			empHrs = 4;
		else if(empCheck == full_time)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs*empRatePerHour;
		System.out.println("Emp Wage: "+empWage);
	}
}
