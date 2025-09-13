package com.tnsif.stmts;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153; //153,370,371,407 6=216,7=343,8=512,9=729
		int originalnum = num;
		int result = 0;
		 
		while(num > 0) {
			int digit = num % 10;
			result += digit*digit*digit;
			num /= 10;
		}
		
		if(result == originalnum) {
			System.out.println("The number is armstrong");
		} else {
			System.out.println("The number is not armstrong");
		}

	}

}
