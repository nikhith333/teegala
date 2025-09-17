package com.tnsif.day5;

public class Constructor {
	// Program showing Default and Parameterized Constructors
	public class Student {
	    String name;
	    int rollNo;

	    // 1. Default Constructor
	    Student() {
	        name = "Unknown";
	        rollNo = 0;
	    }

	    // 2. Parameterized Constructor
	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Roll No: " + rollNo);
	    }

	    public static void main(String[] args) {
	        // Object created using default constructor
	        Student s1 = new Student();

	        // Object created using parameterized constructor
	        Student s2 = new Student("Ravi", 101);

	        // Display details
	        s1.display();
	        s2.display();;
	}
	}

}
