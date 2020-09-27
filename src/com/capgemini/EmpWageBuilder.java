package com.capgemini;
import java.util.*;
public class EmpWageBuilder implements IComputeEmpWage{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public ArrayList<CompanyEmpWage> companyList = new ArrayList<CompanyEmpWage>();
	
	public void computeEmpWage() {
		for(int i=0;i<companyList.size();i++) {
			computeEmpWage(companyList.get(i));
			System.out.println(companyList.get(i));
		}
	}
	public static void computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
		while(totalEmpHrs <= companyEmpWage.max_hrs_in_month && totalWorkingDays < companyEmpWage.num_of_working_days) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
			
		}
		companyEmpWage.totalEmpWage = totalEmpHrs*companyEmpWage.emp_rate_per_hour;
		companyEmpWage.setTotalEmpWage(companyEmpWage.totalEmpWage);
		
	}
	
	public static void main(String[] args) {
		EmpWageBuilder emp = new EmpWageBuilder();
		emp.companyList.add(new CompanyEmpWage("DMart", 20, 2, 10));
		emp.companyList.add(new CompanyEmpWage("Reliance",10,4,20));
		emp.computeEmpWage();
	}
}
