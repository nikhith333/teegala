package com.nikhith.assignment1.utilities;
	import com.nikhith.assignment.employees.Employee;
	import com.nikhith.assignment.employees.Manager;
	import com.nikhith.assignment.employees.Developer;

	public class EmployeeUtilities {

	    public static double calculateAnnualSalary(Employee e) {
	        return e.getSalary() * 12;
	    }

	    public static void giveRaise(Employee e, double percent) {
	        double newSalary = e.getSalary() * (1 + percent / 100.0);
	        e.setSalary(newSalary);
	    }

	  public static void printEmployeeInfo(Employee e) {
	        System.out.println("---- Employee Info ----");
	        if (e instanceof Manager) {
	            ((Manager) e).displayManagerInfo();
	        } else if (e instanceof Developer) {
	            ((Developer) e).displayDeveloperInfo();
	        } else {
	           
	            System.out.println("Name: " + e.getName());
	            System.out.println("ID: " + e.getEmployeeId());
	            System.out.println("Salary: " + e.getSalary());
	        }
	        System.out.println("-----------------------");;
	}
	}



