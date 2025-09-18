package com.tnsif.day6;

public class GetterSetter {
	
	class Student {
	    // private fields
	    private String name;
	    private int age;

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age (with validation)
	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Must be positive.");
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Student s = new Student();

	        // setting values using setters
	        s.setName("Nikhith");
	        s.setAge(20);

	        // getting values using getters
	        System.out.println("Name: " + s.getName());
	        System.out.println("Age: " + s.getAge());

	        // invalid example
	        s.setAge(-5);;  // will show validation message
	}
	}


}
