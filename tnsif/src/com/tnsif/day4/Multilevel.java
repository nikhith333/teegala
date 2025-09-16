package com.tnsif.day4;

public class Multilevel {

	class Class1 {
	    void class1Method() {
	        System.out.println("This is Class 1");
	    }
	}

	class Class2 extends Class1 {
	    void class2Method() {
	        System.out.println("This is Class 2");
	    }
	}
	
	class Class3 extends Class2 {
	    void class3Method() {
	        System.out.println("This is Class 3");
	    }
	}
}
