package com.tnsif.day7;

public class JaggedStatic {
	    public static void main(String[] args) {
	        // Declare a jagged array with 3 rows
	        int[][] jaggedArr = new int[3][];

	        // Initialize each row with different column sizes
	        jaggedArr[0] = new int[]{1, 2, 3};         // 3 elements
	        jaggedArr[1] = new int[]{4, 5};            // 2 elements
	        jaggedArr[2] = new int[]{6, 7, 8, 9};      // 4 elements

	        // Print the jagged array
	        System.out.println("Jagged Array (static values):");
	        for (int i = 0; i < jaggedArr.length; i++) {
	            for (int j = 0; j < jaggedArr[i].length; j++) {
	                System.out.print(jaggedArr[i][j] + " ");
	            }
	            System.out.println(); // new line after each row
	        }
	    }
	}

