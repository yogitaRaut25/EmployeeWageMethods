package com.employeeWageUsingMethods.practice;

public class Uc1_EmployeeAttendanceUsingMethod {
	public static final int IS_PRESENT = 1;

	public static void presentyCheck() {
		//local variables
		int workHrs;
		int empCheck = (int)(Math.random()*10)%2;

		//computation to check presenty
		if(empCheck == IS_PRESENT) {
			workHrs = 8;
			System.out.println("Employee is present & working hours = "+workHrs);
		}
		else {
			workHrs = 0;
			System.out.println("Employee is absent & working hours = "+workHrs);
		}
	}

	public static void main(String[] args) {
		presentyCheck();
	}

}