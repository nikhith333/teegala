package com.tnsif.day9;

public class ArmstrongTrace {

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

// Armstrong numbers is a number that equals the sum of the cube of its own digits.
//for num=153, the num 153 is assigned to Originalnum and result is assigned zero.
//since 153>0 (true) enter into while block => digit = 153 % 10 = 3.
//result = 3*3*3 => 27 , num = 153 / 10 = 15 (num = 15)
//since 15>0 (true) enter into while block => digit = 15 % 10 = 5.
//result = 9+5*5*5 => 152 , num = 15 / 10 = 1 (num = 1)
//since 1>0 (true) enter into while block => digit = 1 % 10 = 1.
//result = 152+1*1*1 => 153 , num = 1 / 10 = 0 (num = 0)
//since 0!>0 (False) come out of while block
//since result =  Originalnum print "The number is armstrong".
