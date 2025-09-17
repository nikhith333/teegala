package com.tnsif.day5;

public class Overload {

	    // 1. Different number of parameters
	    void show(int a) {
	        System.out.println("Method with 1 int parameter: " + a);
	    }

	    void show(int a, int b) {
	        System.out.println("Method with 2 int parameters: " + a + ", " + b);
	    }

	    // 2. Different type of parameters
	    void show(String s) {
	        System.out.println("Method with 1 String parameter: " + s);
	    }

	    void show(double d) {
	        System.out.println("Method with 1 double parameter: " + d);
	    }

	    // 3. Different sequence of parameters
	    void show(int a, String s) {
	        System.out.println("Method with (int, String): " + a + ", " + s);
	    }

	    void show(String s, int a) {
	        System.out.println("Method with (String, int): " + s + ", " + a);
	    }

	    public static void main(String[] args) {
	        Overload obj = new Overload();

	        // Calling different overloaded methods
	        obj.show(10);               // int
	        obj.show(10, 20);           // two ints
	        obj.show("Hello");          // String
	        obj.show(15.5);             // double
	        obj.show(100, "World");     // (int, String)
	        obj.show("Java", 200);;      // (String, int)
	}
	}


