package com.tnsif.day8;

public class Finally {

	    public static void main(String[] args) {
	        try {
	            int num = 10 / 0; // Exception occurs
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	        } finally {
	            System.out.println("Finally block always executes (cleanup code).");
	        }

	        System.out.println("Program continues...");
	    }
	}



