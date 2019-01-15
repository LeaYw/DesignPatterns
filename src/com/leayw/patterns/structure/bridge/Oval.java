package com.leayw.patterns.structure.bridge;

public class Oval extends Shape {

    public Oval(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("Oval");
        color.applyColor();
    }
}
