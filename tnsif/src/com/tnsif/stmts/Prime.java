package com.tnsif.stmts;

public class Prime {

	public static void main(String[] args) {
		int num = 33;
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
