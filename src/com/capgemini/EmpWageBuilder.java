package com.capgemini;

public class EmpWageBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_full_time =1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == is_full_time)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
