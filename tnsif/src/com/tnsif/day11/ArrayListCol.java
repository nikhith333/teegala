package com.tnsif.day11;
import java.util.*;

public class ArrayListCol {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> l = new ArrayList<>();

        l.add("hyderabad");
        l.add("chennai");

        System.out.println(l);        // prints the whole list
        l.remove(0);                // if you uncomment this, it removes the first element
        System.out.println(l);        // prints the list again
        System.out.println(l.get(0)); // prints the first element
    }
}
