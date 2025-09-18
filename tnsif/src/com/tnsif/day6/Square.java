package com.tnsif.day6;

public class Square extends Shape {
    private int side=3;

    public Square(int side) {
        this.side = side;
    }

    // implementing abstract method
    void calArea() {
        super.area = side * side;
    }
}
