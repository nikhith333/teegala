package com.tnsif.day10;

public class ThreadJoinMain {

	    public static void main(String[] args) {
	        ThreadJoin t1 = new ThreadJoin();
	        ThreadJoin t2 = new ThreadJoin();
	        ThreadJoin t3 = new ThreadJoin();

	        t1.start();
	        try {
	            t1.join(); // main thread waits until t1 completes
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }

	        t2.start();
	        try {
	            t2.join(); // main waits until t2 completes
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }

	        t3.start(); // will start only after t2 completes
	    }
	}


