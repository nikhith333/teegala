package com.tnsif.day10;


public class ThreadClassMain {

		    public static void main(String[] args) {
		        ThreadClass d = new ThreadClass();
		        d.setPriority(1);  // minimum priority
		        d.start();

		        ThreadClass d1 = new ThreadClass();
		        d1.setPriority(10); // maximum priority
		        d1.start();
		    }
		}

