package com.tnsif.day5;

public class Override {
	// Parent class
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// Child class overriding parent method
	class Dog extends Animal {
	
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Another child class
	class Cat extends Animal {

	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	// Main class
	public class MethodOverridingDemo {
	    public static void main(String[] args) {
	        Animal a1 = new Animal();
	        Animal a2 = new Dog();  // Upcasting
	        Animal a3 = new Cat();  // Upcasting

	        a1.sound();  // calls Animal's method
	        a2.sound();  // calls Dog's overridden method
	        a3.sound();  // calls Cat's overridden method
	    }
	}

}
