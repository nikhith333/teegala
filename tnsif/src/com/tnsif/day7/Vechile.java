package com.tnsif.day7;

public interface Vechile {
	
	 void start();
	    void stop();
	}

	// Child interface extending parent interface
	interface Car extends Vechile {
	    void fuelType();
	}


