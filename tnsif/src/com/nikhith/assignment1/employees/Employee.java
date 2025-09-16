package com.nikhith.assignment1.employees;

public class Employee {

	    private String name;
	    private int employeeId;
	    private double salary;

	    protected Employee() { }

	    protected Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getEmployeeId() { return employeeId; }
	    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }

	    protected void displayBasicInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	}
	}


