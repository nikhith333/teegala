package com.tnsif.day4;

public class Super {
	class Parent {
	    void display() {
	        System.out.println("Display method from Parent class");
	    }
	}

	class Child extends Parent {
	    void display() {
	        System.out.println("Display method from Child class");
	    }

	    void show() {
	       
	        super.display();
	    }
	}

	public class SuperExample {
	    public static void main(String[] args) {
	        Child obj = new Child();
	        obj.display();  
	        obj.show();     
	    }
	}

}
