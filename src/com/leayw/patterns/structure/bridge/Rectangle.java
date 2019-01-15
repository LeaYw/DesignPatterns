package com.leayw.patterns.structure.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("rectangle");
        color.applyColor();
    }
}
