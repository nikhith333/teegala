package com.tnsif.day6;

//Abstract class
public abstract class Shape {
 protected float area;   // common variable

 // abstract method (must be implemented in child classes)
 abstract void calArea();

 // concrete method (already implemented)
 public void show() {
     System.out.println("The area of shape is: " + area);
 }
}
