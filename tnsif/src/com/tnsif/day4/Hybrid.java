package com.tnsif.day4;

public class Hybrid {
 class Parent{
	 void parentmethod(){
		 System.out.println("This is main class");
	 }
 }
 class child1 extends Parent{
     void  show() {
    	 System.out.println("This is child1 class");
     }
 }
 class child2 extends Parent{
	 void show1() {
		 System.out.println("This is child2 class");
	 }
 }
 class child3 extends child2{
	 void show2( ) {
		 System.out.println("This is child3 class");
	 }
 }
}
