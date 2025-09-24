package com.tnsif.day10;

public class ThreadWaitMain {
	
	    public static void main(String[] args) {
	        ThreadWait resource = new ThreadWait();

	        // Producer Thread
	        Thread t1 = new Thread(() -> resource.produce());

	        // Consumer Thread
	        Thread t2 = new Thread(() -> resource.consume());

	        t1.start();
	        t2.start();
	    }
	}


