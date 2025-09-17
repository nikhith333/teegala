package com.tnsif.day5;

public class ConstructorOverloading {
	    String name;
	    int age;
	    String course;

	    // 1. Constructor with no parameters
	    ConstructorOverloading() {
	        name = "Unknown";
	        age = 0;
	        course = "Not Assigned";
	    }

	    // 2. Constructor with one parameter
	    ConstructorOverloading(String n) {
	        name = n;
	        age = 18;  // default age
	        course = "General";
	    }

	    // 3. Constructor with two parameters
	    ConstructorOverloading(String n, int a) {
	        name = n;
	        age = a;
	        course = "General";
	    }

	    // 4. Constructor with three parameters
	    ConstructorOverloading(String n, int a, String c) {
	        name = n;
	        age = a;
	        course = c;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	    }

	    public static void main(String[] args) {
	        // Calling different constructors
	    	ConstructorOverloading s1 = new ConstructorOverloading();
	    	ConstructorOverloading s2 = new ConstructorOverloading("Ravi");
	    	ConstructorOverloading s3 = new ConstructorOverloading("Priya", 20);
	        ConstructorOverloading s4 = new ConstructorOverloading("Anil", 22, "Computer Science");

	        // Display details
	        s1.display();
	        s2.display();
	        s3.display();
	        s4.display();;
	
	    }
	}


