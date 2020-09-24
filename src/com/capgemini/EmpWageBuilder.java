package com.capgemini;

public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2,EMP_RATE_PER_HOUR = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs = 0,empWages = 0;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch(empCheck) {
		case IS_PART_TIME:{
			empHrs = 4;
			break;
		}
		case IS_FULL_TIME:{
			empHrs = 8;
			break;
		}
		default:
			empHrs = 0;
		}
		empWages = empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp wage: "+empWages);
	}
}
