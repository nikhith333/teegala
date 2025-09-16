package com.nikhith.assignment1.employees;

import com.nikhith.assignment.employees.Employee;

public class Manager extends Employee {
	    private String department;
	    private int teamSize;

	    public Manager(String name, int employeeId, double salary, String department, int teamSize) {
	        super(name, employeeId, salary);
	        this.department = department;
	        this.teamSize = teamSize;
	    }

	    public String getDepartment() { return department; }
	    public void setDepartment(String department) { this.department = department; }

	    public int getTeamSize() { return teamSize; }
	    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

	    public void displayManagerInfo() {
	        displayBasicInfo(); // protected helper from Employee
	        System.out.println("Department: " + department);
	        System.out.println("Team size: " + teamSize);;
	}
	}


