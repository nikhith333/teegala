package com.tnsif.day10;

public class ThreadRunnableInt implements Runnable {

	    public void run() {
	        try {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println("This is thread J " + i);
	                Thread.sleep(2000);
	            }
	        } catch (Exception e) {
	           
	        	 System.out.println( e );
	        }
	    }
}

