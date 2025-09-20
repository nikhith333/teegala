package com.tnsif.day7;

public class Wrapperclass {
	    public static void main(String[] args) {
	        
	        // -----------------------
	        // AUTOBOXING EXAMPLES
	        // -----------------------
	        // Example 1: int -> Integer
	        int a = 100;
	        Integer obj1 = a;   // Autoboxing
	        System.out.println("Autoboxing Example 1 (int -> Integer): " + obj1);

	        // Example 2: float -> Float
	        float b = 12.5f;
	        Float obj2 = b;     // Autoboxing
	        System.out.println("Autoboxing Example 2 (float -> Float): " + obj2);

	        // Example 3: char -> Character
	        char c = 'X';
	        Character obj3 = c; // Autoboxing
	        System.out.println("Autoboxing Example 3 (char -> Character): " + obj3);


	        // -----------------------
	        // AUTO-UNBOXING EXAMPLES
	        // -----------------------
	        // Example 1: Integer -> int
	        Integer x = 500;
	        int val1 = x;       // Auto-unboxing
	        System.out.println("Auto-unboxing Example 1 (Integer -> int): " + val1);

	        // Example 2: Double -> double
	        Double y = 99.99;
	        double val2 = y;    // Auto-unboxing
	        System.out.println("Auto-unboxing Example 2 (Double -> double): " + val2);

	        // Example 3: Boolean -> boolean
	        Boolean z = true;
	        boolean val3 = z;   // Auto-unboxing
	        System.out.println("Auto-unboxing Example 3 (Boolean -> boolean): " + val3);
	    }
	}


