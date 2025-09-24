package com.tnsif.day10;

public class ThreadJoin  extends Thread {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            try {
	                Thread.sleep(1000); // pause for 1 sec
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}


