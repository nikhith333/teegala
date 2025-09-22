package com.tnsif.day8;

public class NestedTry {

	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println("Outer try block started...");

	            try {
	                int result = 10 / 0;  // ArithmeticException
	                System.out.println("Result: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Inner catch: Cannot divide by zero.");
	            }

	            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Outer catch: Array index is out of range.");
	        }

	        System.out.println("Program continues after nested try...");
	    }
	}


