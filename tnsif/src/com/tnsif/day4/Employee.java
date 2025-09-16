package com.tnsif.day4;
import java.util.Scanner;
public class Employee {

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = sc.nextLine();
		
		System.out.println("Enter your ID");

		int ID = sc.nextInt();
		
		System.out.println("Enter your Salary");

		double Salary = sc.nextDouble();

		System.out.println("Enter your location");

		String location = sc.next();

		System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: " + Salary);
        System.out.println("Location: " + location);

    		}
	}

