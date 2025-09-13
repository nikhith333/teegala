package com.tnsif.stmts;

public class Prime100 {

	public static void main(String[] args) {
		System.out.println("The prime numbers from 1 to 100 are:");
		
		for(int num=2;num<=100;num++) {
			boolean isprime = true;
			
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println(num+" ");
			}
		}

	}

}
