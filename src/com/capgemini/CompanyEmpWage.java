package com.capgemini;
import java.util.*;
public class CompanyEmpWage {
	public String company;
	public int emp_rate_per_hour, num_of_working_days, max_hrs_in_month;
	public int totalEmpWage;
	public ArrayList<Integer> dailyEmpWage = new ArrayList<Integer>();

	public CompanyEmpWage(String company, int emp_rate_per_hour, int num_of_working_days, int max_hrs_in_month) {
		this.company = company;
		this.emp_rate_per_hour = emp_rate_per_hour;
		this.num_of_working_days = num_of_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public void setDailyEmpWage(int dailyWage,int day) {
		dailyEmpWage.add(dailyWage);
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + company + " is :" + totalEmpWage;
	}

}
