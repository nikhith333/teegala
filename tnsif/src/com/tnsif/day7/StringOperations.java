package com.tnsif.day7;

public class StringOperations {

	    public static void main(String[] args) {
	        // ===== STRING OPERATIONS =====
	        String str = "Hello";
	        System.out.println("Original String: " + str);

	        // Concatenation (creates a new object)
	        str = str.concat(" World");
	        System.out.println("After Concatenation: " + str);

	        // Length
	        System.out.println("Length: " + str.length());

	        // Substring
	        System.out.println("Substring(0, 5): " + str.substring(0, 5));

	        // Uppercase
	        System.out.println("Uppercase: " + str.toUpperCase());

	        // ===== STRINGBUFFER OPERATIONS =====
	        StringBuffer sb = new StringBuffer("Hello");
	        System.out.println("\nOriginal StringBuffer: " + sb);

	        // Append
	        sb.append(" World");
	        System.out.println("After Append: " + sb);

	        // Insert
	        sb.insert(6, "Java ");
	        System.out.println("After Insert: " + sb);

	        // Replace
	        sb.replace(6, 10, "C++");
	        System.out.println("After Replace: " + sb);

	        // Reverse
	        sb.reverse();
	        System.out.println("After Reverse: " + sb);

	        // ===== STRINGBUILDER OPERATIONS =====
	        StringBuilder sbd = new StringBuilder("Hello");
	        System.out.println("\nOriginal StringBuilder: " + sbd);

	        // Append
	        sbd.append(" World");
	        System.out.println("After Append: " + sbd);

	        // Delete
	        sbd.delete(5, 11);
	        System.out.println("After Delete: " + sbd);

	        // Insert
	        sbd.insert(5, " Java");
	        System.out.println("After Insert: " + sbd);

	        // Reverse
	        sbd.reverse();
	        System.out.println("After Reverse: " + sbd);
	    }
	}
