package com.tnsif.day4;

public class Hierarchy {

	class Parent {
	    void parentMethod() {
	        System.out.println("This is Parent class");
	    }
	}

	class Child1 extends Parent {
	    void child1Method() {
	        System.out.println("This is Child1 class");
	    }
	}

	class Child2 extends Parent {
	    void child2Method() {
	        System.out.println("This is Child2 class");
	    }
	}
}
