package com.tnsif.first;

public class Variables {

				    String name = "Nikhith";
				    void display() {
                        int age = 20;
				        System.out.println("Name (instance variable): " + name);
				        System.out.println("Age (local variable): " + age);
				    }

				    public static void main(String[] args) {
				        Variables obj = new Variables();
				        obj.display();

	}

}
