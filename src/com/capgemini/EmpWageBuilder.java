package com.capgemini;

public class EmpWageBuilder {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2,emp_rate_per_hour = 20,num_of_working_days = 20;
	public static final int max_hrs_in_month = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
		while(totalEmpHrs <= max_hrs_in_month && totalWorkingDays < num_of_working_days) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case is_part_time:{
				empHrs = 4;
				break;
			}
			case is_full_time:{
				empHrs = 8;
				break;
			}
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
			
		}
		int totalEmpWage = totalEmpHrs*emp_rate_per_hour;
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}
}
