package com.tnsif.day11;
import java.util.*;

public class LinkedListCol {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        l.addFirst("hyderabad");
        l.addFirst("chennai");
        System.out.println(l);    // after adding first two

        l.addLast("mumbai");
        l.addLast("pune");
        System.out.println(l);    // after adding at last

        String ss = l.getFirst();
        System.out.println(ss);

        String sg = l.getLast();
        System.out.println(sg);

        l.removeFirst();
        System.out.println(l);

        l.removeLast();
        System.out.println(l);
    }
}
