package com.tnsif.stmts;

	import com.nikhith.assignment.employees.Manager;
	import com.nikhith.assignment.employees.Developer;
	import com.nikhith.assignment.utilities.EmployeeUtilities;

	public class AssignmentMain {
	    public static void main(String[] args) {
	        Manager manager = new Manager("Alice", 101, 80000.0, "Sales", 8);
	        Developer developer = new Developer("Bob", 102, 60000.0, "Java", "Senior");

	        EmployeeUtilities.printEmployeeInfo(manager);
	        System.out.println("Annual Salary (manager): " + EmployeeUtilities.calculateAnnualSalary(manager));

	        System.out.println();

	        EmployeeUtilities.printEmployeeInfo(developer);
	        System.out.println("Annual Salary (developer): " + EmployeeUtilities.calculateAnnualSalary(developer));

	        System.out.println("\nGiving developer a 10% raise...\n");
	        EmployeeUtilities.giveRaise(developer, 10);
	        EmployeeUtilities.printEmployeeInfo(developer);
	        System.out.println("New annual salary (developer): " + EmployeeUtilities.calculateAnnualSalary(developer));;
	}
	}


