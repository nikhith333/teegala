package com.tnsif.day8;

public class TryCatch {

	    public static void main(String[] args) {
	        try {
	            int num = 10 / 0; // Causes ArithmeticException
	            System.out.println("Result: " + num);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: Division by zero is not allowed.");
	        }

	        System.out.println("Program continues after exception handling...");
	    }
	}



