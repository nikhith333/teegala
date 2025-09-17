package com.tnsif.day5;

public class Static {
	// Java program demonstrating static members
	public class Student {

	    // Static variable (shared by all objects)
	    static String college = "TKR College";

	    // Instance variables
	    String name;
	    int rollNo;

	    // Static block (runs once when class is loaded)
	    static {
	        System.out.println("Static block executed: College initialized");
	    }

	    // Constructor
	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    // Static method (can be called without object)
	    static void changeCollege(String newCollege) {
	        college = newCollege;
	    }

	    // Instance method
	    void display() {
	        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", College: " + college);
	    }

	    public static void main(String[] args) {
	        // Create students
	        Student s1 = new Student("Ravi", 101);
	        Student s2 = new Student("Priya", 102);

	        // Display details before change
	        s1.display();
	        s2.display();

	        // Change college using static method
	        Student.changeCollege("JNTU University");

	        // Display details after change
	        s1.display();
	        s2.display();;
	}
	}


}
