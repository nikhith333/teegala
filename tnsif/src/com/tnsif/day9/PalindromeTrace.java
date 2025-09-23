package com.tnsif.day9;

public class PalindromeTrace {

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
// Palindrome number is a number that reads the same forward and backward.
//for num=12321, the num 12321 is assigned to Originalnum and reverse is assigned zero.
//since 12321>0 (true) enter into while block => digit = 12321 % 10 = 1.
//reverse = 0*10 + 1 => 1, num = 12321 / 10 = 1232 (num = 1232)
//since 1232>0 (true) enter into while block => digit = 1232 % 10 = 2.
//reverse = 1*10 + 2 => 12, num = 1232 / 10 = 123 (num = 123)
//since 123>0 (true) enter into while block => digit = 123 % 10 = 3.
//reverse = 12*10 + 3 => 123, num = 123 / 10 = 12 (num = 12)
//since 12>0 (true) enter into while block => digit = 12 % 10 = 2.
//reverse = 123*10 + 2 => 1232, num = 12 / 10 = 1 (num = 1)
//since 1>0 (true) enter into while block => digit = 1 % 10 = 1.
//reverse = 1232*10 + 1 => 12321, num = 1 / 10 = 0 (num = 0)
//since 0!>0 (False) come out of while block
//since reverse =  Originalnum print "The number is Palindrome".
