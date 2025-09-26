package com.tnsif.day11;
import java.util.*;
public class StackCol {
	

	public class Stack_Example {
	    public static void main(String[] args) {
	        Stack<Object> s = new Stack<>();  // use generics

	        s.push("abc");
	        s.push(10);
	        s.push(true);
	        s.push("abc");
	        s.push(null);

	        System.out.println(s);    // print the whole stack
	        s.pop();                   // remove the top element (null)
	        System.out.println(s);    // print again
	        System.out.println(s.peek());  // show the top element without removing
	        System.out.println(s);    // print again to verify peek did not remove
	    }
	}


}
