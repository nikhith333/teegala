package com.tnsif.day6;

public class Rectangle extends Shape {
    private int height=2, width=3;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // implementing abstract method
    void calArea() {
        super.area = height * width;
    }
}
