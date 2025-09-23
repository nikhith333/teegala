package com.tnsif.day9;

public class PrimeTrace {

	public static void main(String[] args) {
		int num = 43;
		boolean isprime = true;
		
		if(num <=1) {
			isprime = false;
		} else {
			for(int i = 2;i <= num/2;i++) {
				if(num % i == 0 ) {
					isprime = false;
					break;
				}
			}
			
		}
		if (isprime) {
			System.out.println("The number is a prime number");
		} else {
			System.out.println("The number is not a prime number");
		}

	}

}

//prime number is a whole number greater than 1 that has exactly two distinct positive divisors: 1 and itself
//since num = 43, First isprime is true
//since num > 1 go to else block
//int i = 2, i <= 43/2 => i<= 21 (true) go to if block
//Since 43 % 2 != 0 iterate the loop
// now i = 3, i <= 43/3 => i<= 14 (true) go to if block
//Since 43 % 3 != 0 iterate the loop
//now i = 4, i <= 43/4 => i<= 10 (true) go to if block
//Since 43 % 4 != 0 iterate the loop
//now i = 5, i <= 43/5 => i<= 8 (true) go to if block
//Since 43 % 5 != 0 iterate the loop
//now i = 6, i <= 43/6 => i<= 7 (true) go to if block
//Since 43 % 6 != 0 iterate the loop
//now i = 7, i <= 43/7 => i<= 6 (False) come out of for block
//since isprime is true print "The number is a prime number".


