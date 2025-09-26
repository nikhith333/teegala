package com.tnsif.day11;
import java.util.*;
public class VectorCol {
	
	    public static void main(String[] args) {
	        Vector<String> l = new Vector<>();

	        l.addElement("hyderabad");
	        l.addElement("chennai");
	        l.addElement("mumbai");

	        System.out.println(l);                 // print full vector
	        l.removeElement("chennai");          // uncomment to remove "chennai"
	        System.out.println(l);               // print after removal
	        System.out.println(l.get(0));          // print element at index 0
	    }
	}


