package com.tnsif.day8;

public class MultipleCatch {

	    public static void main(String[] args) {
	        try {
	            String str = null;
	            System.out.println(str.length());  // NullPointerException
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: " + e);
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Null Pointer Exception: " + e);
	        } 
	        catch (Exception e) {
	            System.out.println("General Exception: " + e);
	        }

	        System.out.println("Program continues after multiple catch blocks...");
	    }
	}

