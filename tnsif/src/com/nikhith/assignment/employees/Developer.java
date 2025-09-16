package com.nikhith.assignment.employees;

	public class Developer extends Employee {
	    private String programmingLanguage;
	    private String level;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage, String level) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	        this.level = level;
	    }

	    public String getProgrammingLanguage() { return programmingLanguage; }
	    public void setProgrammingLanguage(String programmingLanguage) { this.programmingLanguage = programmingLanguage; }

	    public String getLevel() { return level; }
	    public void setLevel(String level) { this.level = level; }

	    public void displayDeveloperInfo() {
	        displayBasicInfo(); 
	        System.out.println("Programming Language: " + programmingLanguage);
	        System.out.println("Level: " +level);;
	}
	}


