package com.tnsif.day8;

public class Throw {
	
	    public static void main(String[] args) {
	        try {
	            checkAge(15); // Throws exception manually
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    static void checkAge(int age) {
	        if (age < 18) {
	            throw new ArithmeticException("Age must be 18 or above!");
	        } else {
	            System.out.println("You are eligible to vote.");
	        }
	    }
	}



