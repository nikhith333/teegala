package com.tnsif.day7;
import java.util.Scanner;

public class JaggedDynamic {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Ask user for number of rows
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        // Step 2: Create a jagged array
	        int[][] jaggedArr = new int[rows][];

	        // Step 3: Take input for each row
	        for (int i = 0; i < rows; i++) {
	            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
	            int cols = sc.nextInt();
	            jaggedArr[i] = new int[cols]; // initialize row with given size

	            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ": ");
	            for (int j = 0; j < cols; j++) {
	                jaggedArr[i][j] = sc.nextInt();
	            }
	        }

	        // Step 4: Display the jagged array
	        System.out.println("\nJagged Array:");
	        for (int i = 0; i < jaggedArr.length; i++) {
	            for (int j = 0; j < jaggedArr[i].length; j++) {
	                System.out.print(jaggedArr[i][j] + " ");
	            }
	            System.out.println(); // new line after each row
	        }

	        sc.close();
	    }
	}



