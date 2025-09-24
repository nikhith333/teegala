package com.tnsif.day10;

public class ThreadWait {
	
	    synchronized void produce() {
	        System.out.println("Producer thread running...");
	        try {
	            wait(); // producer will wait
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	        System.out.println("Producer resumed after notify");
	    }

	    synchronized void consume() {
	        System.out.println("Consumer thread running...");
	        try {
	            Thread.sleep(2000); // simulate some work
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	        notify(); // wake up waiting thread
	        System.out.println("Consumer sent notification");
	    }
	}

	


