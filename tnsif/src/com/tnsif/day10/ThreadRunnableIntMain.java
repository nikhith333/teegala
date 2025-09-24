package com.tnsif.day10;

public class ThreadRunnableIntMain {
	
	    public static void main(String[] args) {
	        ThreadRunnableInt r = new ThreadRunnableInt();
	        Thread t1 = new Thread(r);
	        t1.start();;
	}
	}
