package com.tnsif.day8;

public class StringIndexOutOfBound {
	
	    public static void main(String[] args) {
	        String str = "Hello";

	        try {
	            // Trying to access an invalid index (greater than string length)
	            char ch = str.charAt(10);  // index 10 does not exist
	            System.out.println("Character at index 10: " + ch);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e);
	            System.out.println("You are trying to access an index out of range!");
	        }

	        System.out.println("Program continues after exception handling...");
	    }
	}


