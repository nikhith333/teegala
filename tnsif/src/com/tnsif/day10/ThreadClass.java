package com.tnsif.day10;

public class ThreadClass extends Thread {
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            try {
	                System.out.println("This is Thread: " + i);
	                System.out.println(Thread.currentThread());
	                Thread.sleep(2000); // sleep for 2 seconds
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

	


