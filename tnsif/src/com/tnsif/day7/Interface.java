package com.tnsif.day7;

	class Interface implements Car {
	    @Override
	    public void start() {
	        System.out.println("Car is starting...");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Car has stopped.");
	    }

	    @Override
	    public void fuelType() {
	        System.out.println("Car runs on Petrol.");
	    }
	}


