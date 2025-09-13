package com.tnsif.stmts;

public class Palindrome {

	public static void main(String[] args) {
		int num = 123454321;
		int originalnum = num;
		int reverse=0;
		
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		if(originalnum == reverse) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

	}

}
