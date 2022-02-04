package com.employeeWageUsingMethods.practice;

public class Uc6_EmloyeeWageForMonthAndTotalSalaryUsingMethod {
	//static & final variable
	public static final int IS_PRESENT = 1;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 0;

	public static void employeeWageForMonth() {
		//local variable 
		int monthlyWage = 0, totalHour = 0; 
		int dayPresent = 0 , empHour;

		//computation for employee wage for month & total salary
        Double empCheck = Math.floor(Math.random() * 10) % 3;
		if(empCheck == IS_FULL_TIME )
			empHour=8;
		else if(empCheck == IS_PART_TIME)
			empHour=4;
		else
			empHour=0;

		for(int i=1;i<=31;i++) {
			Double empStatus = Math.floor(Math.random() * 10) % 2;
			if (empStatus == IS_PRESENT) {
				if (dayPresent < 20 && totalHour < 100) {
					dayPresent += 1;
					totalHour += empHour;
				}

			}
		}
		monthlyWage = totalHour * 20;
		System.out.println("working day "+dayPresent);
		System.out.println("total hour worked "+totalHour);
		System.out.println("monthly salary is "+monthlyWage);
	}

	public static void main(String[] args) {
		employeeWageForMonth();
	}
}
