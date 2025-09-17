package com.tnsif.day5;

public class Final {
	// Program demonstrating final members in Java

	// 1. Final class (cannot be inherited)
	final class College {
	    // 2. Final variable (constant)
	    final String collegeName = "TKR College";

	    // 3. Final method (cannot be overridden)
	    final void displayCollege() {
	        System.out.println("College: " + collegeName);
	    }
	}

	// Another class just for demonstration
	class Student {
	    String name;
	    int rollNo;

	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Roll No: " + rollNo);
	    }
	}

	public class FinalMembersDemo {
	    public static void main(String[] args) {
	        // Object of final class
	        College c = new College();
	        c.displayCollege();

	        // Object of normal class
	        Student s1 = new Student("Ravi", 101);
	        Student s2 = new Student("Priya", 102);

	        s1.display();
	        s2.display();;
	}
	}


}
