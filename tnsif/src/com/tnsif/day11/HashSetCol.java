package com.tnsif.day11;
import java.util.*;

public class HashSetCol {
	    public static void main(String[] args) {
	        Set<String> l = new HashSet<>();

	        l.add("rahul");
	        l.add("priya");
	        l.add("sumit");
	        l.add("sumit");  // duplicate — won’t change the set

	        System.out.println(l);     // print the set
	        l.remove("priya");          // remove element “priya”
	        System.out.println(l);     // print again after removal
	    }
	}


